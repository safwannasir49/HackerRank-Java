/*
Enter your query here.
*/
SELECT DISTINCT city FROM station WHERE city NOT REGEXP '^[aeiouAEIOU].*[aeiouAEIOU]$';