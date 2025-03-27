# CSE360 Individual Homework 3

This project contains five standalone automated tests implemented in Java as part of **CSE360 Homework 3**. The tests validate methods from the `Question`, `QuestionList`, `Answer`, and `AnswerList` classes — originally developed in Team Project Phase 2 (TP2). This homework emphasizes the use of automated testing, structured documentation with Javadoc, and the use of Java development tools.

---

## 📁 Project Structure

```
HW3/
├── application/
│   ├── Question.java
│   ├── QuestionList.java
│   ├── Answer.java
│   └── AnswerList.java
├── testing/
│   └── HW3TestMainline.java
├── doc/
│   └── (Javadoc HTML output)
├── HW3_Javadoc.pdf
└── README.md
```

---

## ✅ Automated Tests

All tests are located inside the `HW3TestMainline` class and are run from a standalone `main()` method. The following five methods are tested:

1. `testSetTitle()`  
   - Validates title updates for questions with valid and invalid input.

2. `testSearchQuestions()`  
   - Tests case-insensitive keyword search in `QuestionList`.

3. `testLikeAnswer()`  
   - Validates the like feature in `Answer` with input validation.

4. `testUpdateAnswer()`  
   - Tests updating text and resolved status of answers.

5. `testSetText()`  
   - Validates content input for answers and ensures exception handling.

---

## 🖥️ How to Run

1. Open the project in **Eclipse** or any Java IDE.
2. Navigate to `testing/HW3TestMainline.java`.
3. Run the `main()` method to execute all automated tests.
4. Console output will indicate pass/fail status for each test case.

---

## 📄 Javadoc

- Generated using the official Oracle Javadoc tool (`/usr/bin/javadoc`).
- The `doc/` folder contains full HTML output.
- A PDF version is included as `HW3_Javadoc.pdf`.

---

## 📎 Screencast

🎥 A short screencast demonstrating the tests, results, and Javadoc is available here:  
👉 [Screencast Link Goes Here]

---

## 📚 Javadoc Inspiration Source

Oracle’s Java Collections Framework Documentation:  
🔗 [https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html](https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html)

---

## 👤 Author

**Juhil Sojitra**  
ASU ID: 1228340843  
CSE360 – Spring 2025
