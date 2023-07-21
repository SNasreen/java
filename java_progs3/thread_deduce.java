import java.util.Arrays;

class thread_deduce
{
    private int[] numbers;
    private int average;
    private int maximum;
    private int minimum;

    public thread_deduce(int[] numbers) 
	{
        this.numbers = numbers;
        this.average = 0;
        this.maximum = Integer.MIN_VALUE;
        this.minimum = Integer.MAX_VALUE;
    }

    public void calculateAverage() 
	{
        Thread thread = new Thread(() -> 
		{
            int sum = Arrays.stream(numbers).sum();
            average = sum / numbers.length;
            System.out.println("Average: " + average);
        });
        thread.start();
    }

    public void findMaximum() 
	{
        Thread thread = new Thread(() -> 
		{
            for (int number : numbers) {
                if (number > maximum) {
                    maximum = number;
                }
            }
            System.out.println("Maximum: " + maximum);
        });
        thread.start();
    }

    public void findMinimum() 
	{
        Thread thread = new Thread(() -> 
		{
            for (int number : numbers) {
                if (number < minimum) {
                    minimum = number;
                }
            }
            System.out.println("Minimum: " + minimum);
        });
        thread.start();
    }

    public static void main(String[] args) 
	{
        int[] numbers = { 5, 10, 15, 20, 25 };
        NumberProcessor numberProcessor = new NumberProcessor(numbers);
        numberProcessor.calculateAverage();
        numberProcessor.findMaximum();
        numberProcessor.findMinimum();
    }
}