package number_pkg;

public class Number {
    int num;
    public Number(int x) {
        num = x;
    }

    public boolean isZero() {
        return num == 0;
    }
    public boolean isPositive() {
        return num > 0;
    }
    public boolean isNegative() {
        return num < 0;
    }
    public boolean isOdd() {
        return num % 2 == 1;
    }
    public boolean isEven() {
        return num % 2 == 0;
    }
    public boolean isPrime() {
        boolean prime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    boolean isAmstrong() {
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = num;
        for (; originalNumber != 0; originalNumber /= 10, n++) ;
        originalNumber = num;
        for (; originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }
        return result == num;
    }

    public double getFactorial() {
        double factorial = 1;
        for (int i = num; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public double getSqrt() {
        return Math.sqrt(num);
    }

    double getSqr() {
        return num * num;
    }

    public double sumDigits() {
        double sum = 0;
        for (; num != 0; num /= 10) {
            sum += num;
        }
        return sum;
    }

    public double getReverse() {
        double reverse = 0;
        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
        }
        return reverse;
    }
}


