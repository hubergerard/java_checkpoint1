# CHECKPOINT 1

** Tips: **

* Try to solve the problems from memorizing what you learned (not by googling)
* If you get stuck, skip to the next step!
* Regardless of whether you finish, remember to commit everything and push

## I. Downloading and initializing of the project

### 1. Local repo

Create a fork of this repo on GitHub, and clone the forked repo!

In your local repository, create a branch using the following format: the city of your course in lowercase, your first name and surname without accents or spaces, separate everything with dashes, and write your surname in uppercase. Example: **Peter Schmidt** in Bonn would create a branch called **bonn-peter-SCHMIDT**.

**Work on this branch for the rest of the checkpoint!**

> Tip: commit and push your changes locally after each exercise, to avoid unpleasant surprises

### 2. gitignore

Find and modify the *.gitignore* file from the project root, so that all files with the extension `.class` are ignored.

## II. Java / algorithms

You will find an `algos` folder at the root of your local repository and you should write the following algorithms in the file `Student.java`:

### 1. Major

The school organizes an end-of-year party and all adult students are invited. In order to avoid sending invitations to underage students, you must create a method that checks a student's age and returns whether or not they are of age.

Create a static method named *isLegal*, which returns "true" if the age passed as an argument is greater than or equal to 18 and returns "false" if it is not.

### 2. Grouping people

You have to divide the students in a class into two groups. Each student has a number and you want to use this data to assign them to either group A or B.

Create a static method called *giveGroup*, which takes in a student's number. If this is even, return the character "A", otherwise return the character "B".

### 3. Cleaning data

The school needs to count how many of its future students want to learn Java. To do this, a survey was sent out asking students which language they wanted to study. Students wrote "Java" with inconsistent lower and upper case letters, e. g. "JAVA" or "java", instead of "Java".

Create a static method called *countStudents*, which receives an array containing the languages chosen by the candidates. Return the number of candidates who have chosen Java, regardless of how they wrote it (upper/lower case).

### 4. Testing

Remember to test the methods you have developed. 

To compile and execute the `StudentTest` class, you can use the *tester.sh* script in the `algos` folder as follows:

```Bash
./test.sh
```

## III. Quiz

You will find a `Quiz.java` file at the root of your local repository: compile and run it.

Answer the questions, and at the end it will generate a `quiz.txt` file.

You can then edit the file manually to correct your answers.

> Please answer honestly, without any help from the Internet!


## V. Finalisation

Push the changes made to your local branch; and push everything to your remote repository on GitHub.

On the GitHub website, check that the branch exists and that your changes are present.
