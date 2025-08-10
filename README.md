# ⚡ Java Exception Handling

A beginner-to-advanced guide on **Exception Handling in Java** ⚙️ — with practical examples, clear explanations, and best practices.  
This repository is perfect for students, developers, or anyone looking to **write robust and error-free Java applications**.

---

## 📂 Project Overview
Exception handling is a powerful mechanism in Java to handle runtime errors, ensuring **smooth program execution**.  
This repo covers:
- **Types of Exceptions**
- **`try-catch` and `finally` blocks**
- **`throw` and `throws` keywords**
- **Best Practices**  

---

## 🛠 Topics Covered
- ✅ **Introduction to Exceptions**
- ✅ **Difference between Checked & Unchecked Exceptions**
- ✅ **Using `try`, `catch`, and `finally`**
- ✅ **Multiple Catch Blocks**
- ✅ **Nested Try Statements**
- ✅ **Throwing Exceptions with `throw`**
- ✅ **Declaring Exceptions with `throws`**

---

## ✍️ Author

**Muhammad Shayan Shahid**  
📍 Java & Front-End Learner  
📧 [msshahid23052006@gmail.com](mailto:msshahid23052006@gmail.com)  

Feel free to connect or reach out for collaboration or feedback! 🤝

---

## 📸 Example Code

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("❌ Cannot divide by zero!");
} finally {
    System.out.println("✅ This block always executes.");
}

---
