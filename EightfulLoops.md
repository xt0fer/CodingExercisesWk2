
## The Eightful Loops 

_well, there is actually 9_

#### The canonical `for` loop


```
    for (int i =0; i < 10; i++) {
     System.out.println(i);
    }

```

#### increments and decrements

```
// all the same
i++;
i = i + 1;
i += 1;

i--;
i = i - 1;
i -= 1;
```

And you can

```
x += 5; // same as x = x + 5;
y *= 2; // same as y = y * 2;
z /= 3; // same as z = z / 3;
```

#### The challenges

- For loop from 100 to 5 by 5. Print index var for each step.

```
    for (int i = 100; i > 5; i = i - 5) {
     System.out.println(i);
    }

```

- For loop from 5 to 75 by 10. Print index variable on each value.

```

    for (int i = 5; i <= 75; i = i + 10) {
        System.out.println(i);
    }

```

- Sum Integers from 9 to 17, print sum of integers

```
    sum = 0;
    for (int i = 9; i <= 17; i++) {
        sum = sum + i;
    }
    System.out.println(sum);

```

- Find and print the smallest integer in an array a = [9, 5, 6, 3, 8, 2, 4]; 
and print it.

```
    int small = a[0];
    for (int i = 1; i< a.length; i++) {
        if (a[i] < small) {
            small = a[i];
        } 
    }
    System.out.println(small);

```

- Find largest integer in an array a = [9, 5, 6, 3, 8, 2, 4]; and print it.

```

    int large = a[0];
    for (int i = 1; i< a.length; i++) {
        if (a[i] > large) {
            large = a[i];
        } 
    }
    System.out.println(large);

```

- Find and print index of first true element in an array of booleans a = 
[false, false, false, true, false];

```
    for (int i = 0; i< a.length; i++) {
        if (a[i] == true) {
            System.out.println(i);
            break;
        } 
    }

```

- Find and print index of first true element in an array of booleans (must 
use a while loop) a = [false, false, false, true, false];

```
    int i = 0;
    while (i < a.length) {
        if (a[i] == true) {
            System.out.println(i);
				  break;
        } 
        i++;
    }

```

And to to do this with a _for each_ loop.

```

int small = a[0];
for (int element : a) {
        if (element < small) {
                small = element;
        }
}
System.out.println(small);

```

- add 5 to every element of an array of integers a = [9, 5, 6, 3, 8, 2, 4]

```
    for (int i = 0; i< a.length; i++) {
        a[i] = a[i] + 5;
    }

```

- divide each element of an array by 1.3; a = [0.5, 1.4, 6.7, 123.4 -34.6]

```
    for (int i = 0; i< a.length; i++) {
        a[i] = a[i] / 1.3;
    }

```

_that wasn’t so bad._
