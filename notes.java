

/*****
EXERCISES

1) For loop from 100 to 5 by 5. print index variable for each value.
2) For loop from 5 to 75 by 10. print index variable on each value.
3) Sum Integers from 9 to 17, print sum

Using this array a = [9, 5, 6, 3, 8, 2, 4];

4) Loop thru and find and print the smallest integer in the array.
5) Loop thru and find and print the largest integer in the last array
 and print the value AND the index of the value.
*/


// 1
for (int i = 100; i >= 5; i = i-5) {
  System.out.println(i);
}

// 2
for (int i = 5; i<=75; i=i+10) {
  System.out.println(i);)
}

// 3
int s = 0;
for (int i = 9; i <= 17; i++) {
    s = s + i;
}
System.out.println(s);


// 4
int min = a[0];
for (int i = 1, i < a.length; i++) {
    if (a[i] < min) {
	    min = a[i];
	}
}
System.out.printlin(min);

//OR

// 4+
List<Integer> m = new ArryList<>(a);
System.out.println(Collections.min(m));



//#5
int max = a[0];
int atIdx = 0;
for (int i = 1, i < a.length; i++) {
    if (a[i] > max) {
	    max = a[i];
	    atIdx = i;
	}
}
System.out.printlin(max);
System.out.printlin(atIdx);

//OR ?? 

// SESSION TWO

//There is an object x which has a method (double)Balance(). Build an IF statement that prints "Paid Off" if the result of the balance call is less than of equal to 1.0, else it prints the balance as a Dollar figure (2 decimal places)

if (x.Balance() <= 1.0) {
    System.out.println("Paid Off");
} else {
    System.out.printf("%8.2f", x.Balance());
}

//Build a WHILE loop that turns on the heat if the thermo.getTemp() is less than 72.0 else it turns on the A/C if thermo.getTemp() is greater that 76.0.

while (true) {
    if (thermo.getTemp() < 72.0) turnOnHeat();
    else if (thermo.getTemp() > 76.0) turnOnCool();
}
//Find a number greater than Pi in a double array, print number and its index.

// arr is some double array
for (int i = 0; i < arr.length(); i++){
    if (arr[i] > Math.PI) {
	System.out.printf("%f %d", arr[i], i);
	break;
    }
}

//Given an array of objects (of class Xaction) w/nulls, sum all the values of the objects in the array, using Xaction::getValue(). Print the sum.

Xaction[] arrayOfXactions; // created elsewhere

double sum = 0;
for (Xaction t : arrayOfXactions) {
    if (t != null) {
	sum += t.getValue();
    }
}
System.out.println(sum);

//reverse an array of objects of type Xaction

Xaction[] arrayOfXactions; // created elsewhere
Collections.reverse(Arrays.asList(arrayOfXactions)); 


// Find and print index of first true element in an array of booleans a = [false, false, false, true, false];
	for (String s : a ){
	    if (a[i]) {
			System.out.println(i);
		}
	}

// Find and print index of first true element in an array of booleans (must use a while loop)
int i = 0;
while (i < a.length()) {
    if(a[i]) {
	System.out.printf(i);
    }
    i++;
}

// add 5 to every element of an array of integers a = [9, 5, 6, 3, 8, 2, 4]

for (int i = 0; i < a.length; i++) {
    a[i] += 5;
}

// divide each element of an array by 1.3; a = [0.5, 1.4, 6.7, 123.4 -34.6]
for (int i = 0; i < a.length; i++) {
    a[i] /= 1.3;
}


