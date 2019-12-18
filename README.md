# studenttest
This project is created to get deeper understanding Spring IoC and XML configuration.

Program tests student's knowledge via tests written in txt file.
To use bean config taskbeans.xml your test file must have following structure:\n
1 line: task itself
2 line: answer
3 line: task itself
4 line: answer
and so on.

Student has firsname, lastname, grade.
Firsname and lastname are initialized via constructor, whereas grade is inintialized in setter based on how well student will answers
on quetions which are declared in txt file.
