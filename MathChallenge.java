import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MathChallenge extends JFrame {
    private JLabel problemLabel = new JLabel("", JLabel.CENTER);
    private JLabel scoreLabel = new JLabel("Score: 0", JLabel.CENTER);
    private JLabel timeLabel = new JLabel("Time: 60", JLabel.CENTER);
    private JTextField answerField = new JTextField(10);
    private JButton submitButton = new JButton("Submit");
    private JButton startButton = new JButton("Start Game");
    
    private int score = 0;
    private int timeLeft = 60;
    private int num1, num2, correctAnswer;
    private Timer gameTimer;
    private Random random = new Random();
    private boolean gameRunning = false;
    private int difficulty = 1;
    private int questionCount = 0;
    
    public MathChallenge() {
        // Set up the frame
        super("Math Challenge");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setResizable(false);
        
        // Create panels with spacing
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        
        JPanel topPanel = new JPanel(new GridLayout(1, 2, 20, 0));
        JPanel gamePanel = new JPanel(new GridLayout(3, 1, 0, 20));
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        // Set up components
        problemLabel.setFont(new Font("Arial", Font.BOLD, 24));
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 18));
        timeLabel.setFont(new Font("Arial", Font.BOLD, 18));
        answerField.setFont(new Font("Arial", Font.PLAIN, 18));
        submitButton.setFont(new Font("Arial", Font.BOLD, 16));
        startButton.setFont(new Font("Arial", Font.BOLD, 16));
        
        // Make submit button initially disabled
        submitButton.setEnabled(false);
        answerField.setEnabled(false);
        
        // Add components to panels
        topPanel.add(scoreLabel);
        topPanel.add(timeLabel);
        
        inputPanel.add(answerField);
        inputPanel.add(submitButton);
        
        gamePanel.add(problemLabel);
        gamePanel.add(inputPanel);
        
        controlPanel.add(startButton);
        
        // Add panels to main panel
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(gamePanel, BorderLayout.CENTER);
        mainPanel.add(controlPanel, BorderLayout.SOUTH);
        
        // Add main panel to frame
        add(mainPanel);
        
        // Create the game timer (updates every second)
        gameTimer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timeLeft--;
                timeLabel.setText("Time: " + timeLeft);
                
                if (timeLeft <= 0) {
                    endGame();
                }
            }
        });
        
        // Add action listeners
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startGame();
            }
        });
        
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAnswer();
            }
        });
        
        answerField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAnswer();
            }
        });
        
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void startGame() {
        // Reset game state
        score = 0;
        timeLeft = 60;
        difficulty = 1;
        questionCount = 0;
        gameRunning = true;
        
        // Update UI
        scoreLabel.setText("Score: " + score);
        timeLabel.setText("Time: " + timeLeft);
        submitButton.setEnabled(true);
        answerField.setEnabled(true);
        startButton.setText("Restart");
        
        // Generate first problem
        generateProblem();
        
        // Start timer
        gameTimer.start();
        
        // Focus on answer field
        answerField.requestFocus();
    }
    
    private void endGame() {
        gameTimer.stop();
        gameRunning = false;
        
        submitButton.setEnabled(false);
        answerField.setEnabled(false);
        
        problemLabel.setText("Game Over! Final Score: " + score);
        JOptionPane.showMessageDialog(this, 
            "Game Over!\nYour final score: " + score + 
            "\nQuestions answered: " + questionCount +
            "\nDifficulty reached: " + difficulty,
            "Game Results", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void generateProblem() {
        // Generate numbers based on difficulty
        int maxNumber = 10 * difficulty;
        num1 = random.nextInt(maxNumber) + 1;
        num2 = random.nextInt(maxNumber) + 1;
        
        // Decide the operation based on difficulty
        String operation = "+";
        int operationType = 0;
        
        if (difficulty >= 2) {
            operationType = random.nextInt(2); // 0 for addition, 1 for subtraction
            operation = operationType == 0 ? "+" : "-";
        }
        
        if (difficulty >= 3) {
            operationType = random.nextInt(3); // Add multiplication
            operation = operationType == 0 ? "+" : (operationType == 1 ? "-" : "×");
        }
        
        if (difficulty >= 5) {
            operationType = random.nextInt(4); // Add division
            operation = operationType == 0 ? "+" : (operationType == 1 ? "-" : 
                (operationType == 2 ? "×" : "÷"));
            
            // For division, ensure it's a clean integer division
            if (operationType == 3) {
                num2 = random.nextInt(10) + 1;
                num1 = num2 * (random.nextInt(maxNumber / 2) + 1);
            }
        }
        
        // Calculate the correct answer
        switch (operation) {
            case "+":
                correctAnswer = num1 + num2;
                break;
            case "-":
                // Ensure positive answer for subtraction
                if (num1 < num2) {
                    int temp = num1;
                    num1 = num2;
                    num2 = temp;
                }
                correctAnswer = num1 - num2;
                break;
            case "×":
                correctAnswer = num1 * num2;
                break;
            case "÷":
                correctAnswer = num1 / num2;
                break;
        }
        
        // Update problem label
        problemLabel.setText(num1 + " " + operation + " " + num2 + " = ?");
        
        // Clear answer field
        answerField.setText("");
    }
    
    private void checkAnswer() {
        if (!gameRunning) return;
        
        try {
            int userAnswer = Integer.parseInt(answerField.getText().trim());
            questionCount++;
            
            if (userAnswer == correctAnswer) {
                // Correct answer
                score += difficulty * 10;
                scoreLabel.setText("Score: " + score);
                
                // Increase difficulty every 5 correct answers
                if (questionCount % 5 == 0 && difficulty < 6) {
                    difficulty++;
                }
                
                // Add bonus time for correct answers
                timeLeft += 2;
                timeLabel.setText("Time: " + timeLeft);
                
                // Visual feedback
                problemLabel.setForeground(new Color(0, 128, 0));  // Green
                
                // Generate a new problem after a short delay
                Timer feedbackTimer = new Timer(500, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        problemLabel.setForeground(Color.BLACK);
                        generateProblem();
                    }
                });
                feedbackTimer.setRepeats(false);
                feedbackTimer.start();
            } else {
                // Wrong answer
                problemLabel.setForeground(Color.RED);
                
                // Penalty
                timeLeft -= 3;
                timeLabel.setText("Time: " + timeLeft);
                
                if (timeLeft <= 0) {
                    endGame();
                }
                
                // Clear the field but don't generate new problem
                answerField.setText("");
                answerField.requestFocus();
            }
        } catch (NumberFormatException e) {
            // Invalid input
            answerField.setText("");
            answerField.requestFocus();
        }
    }
    
    public static void main(String[] args) {
        // Use system look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MathChallenge();
            }
        });
    }
}
