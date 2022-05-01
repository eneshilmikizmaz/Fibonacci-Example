import java.util.Scanner;

public class Fibonacci {
    private int[] fibArr;
    private int elementsNum ;

    private void setElementsNum(int elementsNum) {
        this.elementsNum = elementsNum;
    }

    private int getElementsNum() {
        return elementsNum;
    }

    private void setFibArr(int[] fibArr) {
        this.fibArr = fibArr;
    }

    private int getFibArr(int index) {
        return fibArr[index];
    }
    private void addFibArr(int fibNum,int index){
        fibArr[index]= fibNum;
    }

    private void fibonacciList() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci eleman sayısını giriniz : ");
        setElementsNum(scanner.nextInt());
        int firstElm = 0;
        int secondElm = 1;
        int[] tmpArr = new int[getElementsNum()];
        setFibArr(tmpArr);
        for (int i = 0; i < getElementsNum(); i++) {
            addFibArr(firstElm,i);
            int nextElm = firstElm + secondElm;
            firstElm = secondElm;
            secondElm = nextElm;
        }
    }
    public void writeFibList(){
        fibonacciList();
        for (int i=0;i<fibArr.length;i++){
            System.out.print(getFibArr(i) + ", ");
        }

    }
}
