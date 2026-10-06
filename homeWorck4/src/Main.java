
void main() {
    Scanner scanner = new Scanner(System.in);

    //Задача 1

    System.out.print("Как вас зовут: ");
    String name= scanner.next();
    System.out.println("Ваш пол (1 - мужчина, 2 - женщина)");
    int yourGender=scanner.nextInt();
    if(yourGender==1){
        System.out.println("Hello Mr "+name);
    }else {
        System.out.println("Hello Ms "+name);
    }


    //Задача 2
    
    System.out.print("Выберите 1 или 2 или 3: ");
    int color= scanner.nextInt();
       if(color==1){
           System.out.println("Красный: Стой");
       }else if(color==2){
           System.out.println("Желтый: Ждите");
       }else if(color==3){
           System.out.println("Зеленый: Идите");
       }else {
           System.out.println("Светофор сломан");
   }

    //Задача 3

    System.out.print("Введите количество баллов: ");
    int point= scanner.nextInt();
    if(point>90 && point<100){
        System.out.println("У вас: 5");
    }else if(point>=75 && point<=89){
        System.out.println("У вас: 4");
    }else if(point>=50 && point<=74){
        System.out.println("У вас: 3");
    }else if(point>=0 && point<=49){
        System.out.println("У вас: 2");
    }else {
        System.out.println("Ошибка ввода");
    }


    //Задача 4

    System.out.print("Введите сумму покупки: ");
    double amount= scanner.nextDouble();
    System.out.print("У вас есть карта (true/false): ");
    boolean haveACard= scanner.nextBoolean();

    double discount=0;

    if(amount>=100 && haveACard){
        System.out.println("Ваша скидка 15%");
        discount=0.15;
        }else if (amount>=100 ^ haveACard){
        System.out.println("Ваша скидка 10%");
        discount=0.10;
    }else {
        System.out.println("У вас нет скидки");
    }
    double finalAmount=amount*(1-discount);
    System.out.println("Итоговая сумма к оплате: "+finalAmount);


    //Задача 5

    int ID=1001;
    int PIN=7777;

    System.out.print("Введите ID: ");
    int inputId= scanner.nextInt();
    System.out.print("Введите PIN: ");
    int inputPin= scanner.nextInt();
    if(inputId==ID && inputPin==PIN){
        System.out.println("ID и PIN верны"+"->"+"\"Добро пожаловать\"");
    }else if(inputId==ID && inputPin!=PIN){
        System.out.println("\"Неверный PIN\"");
    }else if(inputId!=ID){
        System.out.println("\"Пользователь не найден\"");
    }

    //Задача 6

    System.out.print("Введите год: ");
    int year= scanner.nextInt();
    if(year%4==0 && year%100!=0||(year%400==0)){
        System.out.println(year+" -> високосный");
    }else {
        System.out.println(year+"-> не високосный");
    }

    //Задача 7
    
    System.out.print("Введите три целых числа: ");

    int numOne = scanner.nextInt();
    int numTwo = scanner.nextInt();
    int numThree = scanner.nextInt();

    if(numOne==numTwo && numTwo==numThree){
        System.out.println("Все числа равны!");
    }else {
        int max=numOne;
        if(numTwo>max){
            max=numTwo;
        }
        if(numThree>max){
            max=numThree;
        }
        System.out.println("Наибольшее число: "+max);
    }

    //Задача 8

    int temperature = 20;
    boolean isRain = true;

    String choice = "";

    if (temperature < 0) {
        choice = "Надень шапку и пуховик";
    } else if (temperature <= 15) {
        choice = "Надень куртку";
    } else {
        choice = "Можно в футболке";
    }

    if (isRain) {
        choice += " и возьми зонт";
    }

    System.out.println(choice + ".");


    //Задача 9

   // Scanner scanner = new Scanner(System.in);
    System.out.print("Введите первое чило : ");
    double numFirst = scanner.nextDouble();

    System.out.println("Выберите действие: ");
    System.out.println("1 - сложить");
    System.out.println("2 - вычесть");
    System.out.println("3 - умножить");
    System.out.println("4 - разделить");
    int select = scanner.nextInt();

    System.out.println("Введте второе чило: ");
    double numSecond= scanner.nextDouble();

    if (select == 1){
        System.out.println(numFirst+numSecond);
    }else if (select == 2){
        System.out.println(numFirst-numSecond);
    }else if (select == 3){
        System.out.println(numFirst*numSecond);
    }else if (select == 4){
        System.out.println(numFirst/numSecond);
    }else  {
        System.out.println("Выне выбрали действие ");
    }
}
