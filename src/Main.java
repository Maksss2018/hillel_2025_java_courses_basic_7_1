void main () {
    int[] arrayOfNumbers = new Random().ints(20, -101, 101).toArray();
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
    IO.println("Array = " + java.util.Arrays.toString(arrayOfNumbers));
    System.out.printf(templateForOutput, sumOfnegativeNumbers,numberOfEvenNumbers,numberOfOddNumbers,smallestNumber, indexOfsmallestNumber, bigestNumber, indexOfbigestNumber, arithmeticMeanOfNumbers );
}
