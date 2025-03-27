package Testing;

import application.*;

/**
 * HW3TestMainline contains automated test cases for Homework 3.
 * It tests methods from the Question, QuestionList, Answer, and AnswerList classes.
 * Each method includes both positive and negative test scenarios.
 */
public class HW3TestMainline {

    /**
     * Main entry point for running all automated tests.
     * It sequentially executes each test case and prints the results.
     *
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println("Starting HW3 Automated Tests...\n");

        testSetTitle();
        testSearchQuestions();
        testLikeAnswer();
        testUpdateAnswer();
        testSetText();

        System.out.println("\nAll HW3 Tests Completed.");
    }

    /**
     * Tests the setTitle method of the Question class.
     * Positive case: valid title update.
     * Negative case: setting an empty title.
     */
    public static void testSetTitle() {
        try {
            Question q = new Question("Title", "Description", "User");
            q.setTitle("New Title");
            System.out.println("✅ testSetTitle PASSED");
        } catch (Exception e) {
            System.out.println("❌ testSetTitle FAILED: " + e.getMessage());
        }

        try {
            Question q = new Question("Title", "Description", "User");
            q.setTitle("  ");  // Should throw exception
            System.out.println("❌ testSetTitle (invalid) FAILED: no exception thrown");
        } catch (IllegalArgumentException e) {
            System.out.println("✅ testSetTitle (invalid) PASSED");
        }
    }

    /**
     * Tests the searchQuestions method of the QuestionList class.
     * Verifies keyword-based search is case-insensitive and accurate.
     */
    public static void testSearchQuestions() {
        QuestionList ql = new QuestionList();
        ql.addQuestion(new Question("Java", "Java is fun", "Alice"));
        ql.addQuestion(new Question("Python", "Python is great", "Bob"));

        if (ql.searchQuestions("java").size() == 1) {
            System.out.println("✅ testSearchQuestions PASSED");
        } else {
            System.out.println("❌ testSearchQuestions FAILED");
        }
    }

    /**
     * Tests the like method of the Answer class.
     * Positive case: liking with a valid username.
     * Negative case: liking with an empty string.
     */
    public static void testLikeAnswer() {
        Answer a = new Answer(1, "This is an answer", "Charlie");
        try {
            a.like("User1");
            System.out.println("✅ testLikeAnswer PASSED");
        } catch (Exception e) {
            System.out.println("❌ testLikeAnswer FAILED: " + e.getMessage());
        }

        try {
            a.like("");  // Invalid
            System.out.println("❌ testLikeAnswer (invalid) FAILED");
        } catch (IllegalArgumentException e) {
            System.out.println("✅ testLikeAnswer (invalid) PASSED");
        }
    }

    /**
     * Tests the updateAnswer method of the AnswerList class.
     * Ensures the text and resolved status can be updated.
     */
    public static void testUpdateAnswer() {
        AnswerList al = new AnswerList();
        Answer a = new Answer(1, "Initial", "Dana");
        al.addAnswer(a);

        try {
            al.updateAnswer(a.getId(), "Updated", true);
            System.out.println("✅ testUpdateAnswer PASSED");
        } catch (Exception e) {
            System.out.println("❌ testUpdateAnswer FAILED: " + e.getMessage());
        }
    }

    /**
     * Tests the setText method of the Answer class.
     * Positive case: updating with valid text.
     * Negative case: updating with empty text.
     */
    public static void testSetText() {
        Answer a = new Answer(1, "Some text", "Eli");

        try {
            a.setText("Updated text");
            System.out.println("✅ testSetText PASSED");
        } catch (Exception e) {
            System.out.println("❌ testSetText FAILED");
        }

        try {
            a.setText("");  // Should fail
            System.out.println("❌ testSetText (invalid) FAILED");
        } catch (IllegalArgumentException e) {
            System.out.println("✅ testSetText (invalid) PASSED");
        }
    }
} 
