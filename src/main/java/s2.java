//Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
//        Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
//        *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
//        Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
//        Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
//        *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
//        **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.



public class s2 {
    public static void main(String[] args) {
        String s1 = "hello world";
        String s2 = "hello world";
        int i1=3;
        int i2=56;
        int i4= Integer.parseInt(String.valueOf(i1+i2));
        int i5= Integer.parseInt(String.valueOf(i1-i2));
        int i6= Integer.parseInt(String.valueOf(i1*i2));
        String s3= " + ";
        String s4= " - ";
        String s5= " = ";
        String s6= " * ";
        String s7= " равно ";

        contines(s1,s2);

        contines(s1, new StringBuilder(s2).reverse().toString());

        StringBuilder sb1= new StringBuilder(String.valueOf(i1)).append(s3).append(i2).append(s5).append(i4);
        System.out.println(sb1);

        StringBuilder sb2= new StringBuilder(String.valueOf(i1)).append(s4).append(i2).append(s5).append(i5);
        System.out.println(sb2);

        StringBuilder sb3= new StringBuilder(String.valueOf(i1)).append(s6).append(i2).append(s5).append(i6);
        System.out.println(sb3);

        sb1.insert(sb1.indexOf("="),s7);
        int index = sb1.indexOf("=");
        sb1.deleteCharAt(index);
        System.out.println(sb1);

        sb2.insert(sb2.indexOf("="),s7);
        int index2 = sb2.indexOf("=");
        sb2.deleteCharAt(index2);
        System.out.println(sb2);

        sb3.insert(sb3.indexOf("="),s7);
        int index3 = sb3.indexOf("=");
        sb3.deleteCharAt(index3);
        System.out.println(sb3);



//
//        add(i1, s3, i2, s5, sum);
//        add(i1,s4,i2,s5,dif);
//        add(i1,s6,i2,s5,math);
//    public static void add(int i1, String s1,int i2,String s2, int i3){
//        StringBuilder str= new StringBuilder(String.valueOf(i1)).append(s1).append(i2).append(s2).append(i3);
//        System.out.println(str);
//    {


    }
    public static void contines(String str1, String str2){
        System.out.println(str1.contains(str2));
    }


}
