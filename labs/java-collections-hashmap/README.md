# HashMap Exercises for Career Development

Teaching students about HashMaps in Java is an excellent way to help them understand the power and efficiency of data structures, which are commonly used in real-world applications. To ensure that students grasp the concepts well and gain skills useful for their careers, here are some meaningful exercises that cover both basic and advanced uses of HashMaps:

---

## 1. Basic HashMap Operations: Insertion, Retrieval, and Removal
**Objective**: Understand basic operations like adding, retrieving, and removing key-value pairs.

**Exercise**:
- Create a `HashMap` to store employee names (as keys) and their corresponding employee IDs (as values).
- Allow users to:
  - Add new employees.
  - Retrieve an employee's ID using their name.
  - Remove an employee from the `HashMap` by name.
  - Display all employees in the `HashMap`.

**Skills Learned**: Basic HashMap operations, key-value pair management.

---

## 2. Counting Word Frequency
**Objective**: Use a `HashMap` to count the frequency of words in a text or file.

**Exercise**:
- Given a sentence (or multiple sentences from a text), create a `HashMap` where the key is the word, and the value is the number of times the word appears.
- Ignore case, and remove punctuation for accurate word counting.
- Display the word frequencies in descending order (most frequent word first).

**Skills Learned**: String manipulation, handling duplicates, sorting in HashMap.

---

## 3. Character Frequency in a String
**Objective**: Explore more advanced `HashMap` manipulation by counting characters in a string.

**Exercise**:
- Write a method that takes a string and returns a `HashMap` containing each character as the key and the number of occurrences as the value.
- For example, given the string "programming", the `HashMap` should return:
  - p -> 1, r -> 2, o -> 1, g -> 2, a -> 1, m -> 2, i -> 1, n -> 1.
- Ensure the output is case-insensitive.

**Skills Learned**: Handling characters as keys in a `HashMap`, string manipulation.

---

## 4. Mapping Employee Salaries
**Objective**: Show practical uses of HashMaps in business applications, like managing salaries.

**Exercise**:
- Create a `HashMap` where the key is an employee's name and the value is their salary.
- Implement methods to:
  - Add or update an employee's salary.
  - Find the employee with the highest salary.
  - Find the employee with the lowest salary.
  - Calculate the average salary of all employees.
  - Provide a list of employees whose salary is above a certain threshold.

**Skills Learned**: Using `HashMap` in business scenarios, aggregating values, managing data.

---

## 5. Unique Elements from Two Lists
**Objective**: Use `HashMap` to find unique elements across multiple data structures.

**Exercise**:
- Given two lists of integers, use a `HashMap` to find the elements that are unique to each list (i.e., elements that appear in only one list, not both).
- Return a `HashMap` where the key is the unique element, and the value is the list it appeared in ("List 1" or "List 2").

**Skills Learned**: Data comparison, managing multiple lists, handling duplicates with HashMaps.

---

## 6. BONUS Inventory Management System
**Objective**: Use `HashMap` to model real-world inventory management.

**Exercise**:
- Design a simple inventory system using a `HashMap` where the key is a product name (String) and the value is the quantity of that product (Integer).
- Implement the following methods:
  - `addProduct(String productName, int quantity)`: Adds a product to the inventory or updates the quantity if it already exists.
  - `removeProduct(String productName)`: Removes a product from the inventory.
  - `checkInventory(String productName)`: Returns the quantity of a specific product.
  - `listAllProducts()`: Prints all products in the inventory.

**Skills Learned**: Inventory management, updating and retrieving values from a `HashMap`, CRUD operations.

---

## 7.BONUS Mapping a Student's Grades
**Objective**: Manage student grades using a `HashMap`, applicable to real-life applications in education.

**Exercise**:
- Create a `HashMap` where the key is a student’s name and the value is their grade (could be a letter or numerical grade).
- Implement the following methods:
  - `addGrade(String studentName, double grade)`: Adds or updates a student's grade.
  - `getGrade(String studentName)`: Retrieves a student’s grade.
  - `averageGrade()`: Returns the average grade for all students.
  - `highestGrade()`: Returns the student with the highest grade.
  - `studentsAboveThreshold(double threshold)`: Returns a list of students with grades above a given threshold.

**Skills Learned**: Real-world application of managing student data, working with numerical data in a `HashMap`.
