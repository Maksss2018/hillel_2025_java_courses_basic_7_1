public class Main {
/*
Створіть Java програму, яка виконує наступні завдання:

    Створіть масив цілих чисел з 20 елементами.
    Заповніть масив випадковими цілими числами в діапазоні від -100 до 100.
    Знайдіть та виведіть суму всіх від'ємних чисел в масиві.
    Знайдіть та виведіть кількість парних і непарних чисел в масиві.
    Знайдіть найбільший та найменший елементи масиву та їхні індекси.
    Знайдіть і виведіть середнє арифметичне чисел, розташованих після першого від'ємного числа у масиві (або повідомте, якщо від'ємних чисел немає).
    Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.

Приклад:

Елементи масиву: [34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8]

Сума від'ємних чисел: -138

Кількість парних чисел: 11

Кількість непарних чисел: 9

Найменший елемент: -50 (з індексом 12)

Найбільший елемент: 99 (з індексом 14)

Середнє арифметичне чисел після першого від'ємного числа: 20.39
* */
    int[] arrayOfNumbers = {34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8};
    int sumOfnegativeNumbers = 0;//Сума від'ємних чисел
    int numberOfEvenNumbers = 0;//Кількість парних чисел
    int numberOfOddNumbers = 0;//Кількість непарних чисел
    int smallestNumber = 0;//Найменший елемент
    int indexOfsmallestNumber = 0;
    int bigestNumber = 0;//Найбільший елемент
    int indexOfbigestNumber = 0;
    double arithmeticMeanOfNumbers = 0.0;//Середнє арифметичне чисел після першого від'ємного числа
    boolean firstNegativeNumberFounded = false;
    double sum = 0.0;
    int count = 0;
    String  templateForOutput = """
             Сума від'ємних чисел: %d
             Кількість парних чисел: %d
             Кількість непарних чисел: %d 
             Найменший елемент: %d (з індексом %d )
             Найбільший елемент: %d (з індексом %d )
             Середнє арифметичне числа: %.2f
             """;
     for (int i = 0; i < arrayOfNumbers.length; i++) {

        if(arrayOfNumbers[i] < 0){
            sumOfnegativeNumbers = sumOfnegativeNumbers + arrayOfNumbers[i];
            firstNegativeNumberFounded = true;
        };
        if(firstNegativeNumberFounded){
            sum = sum +arrayOfNumbers[i];
            count++;
        }
        if (arrayOfNumbers[i] % 2 == 0) {
            numberOfEvenNumbers++;
        } else {
            numberOfOddNumbers++;
        }

        smallestNumber = Math.min(smallestNumber, arrayOfNumbers[i]);
        if(smallestNumber == arrayOfNumbers[i]){
            indexOfsmallestNumber = i;
        }
        bigestNumber = Math.max(bigestNumber, arrayOfNumbers[i]);
        if(bigestNumber == arrayOfNumbers[i]){
            indexOfbigestNumber = i;
        }
    }
    arithmeticMeanOfNumbers = sum/count;
     System.out.printf(templateForOutput, sumOfnegativeNumbers,numberOfEvenNumbers,numberOfOddNumbers,smallestNumber, indexOfsmallestNumber, bigestNumber, indexOfbigestNumber, arithmeticMeanOfNumbers );
}
