// class Time {
//     public static void main(String[] args) {
//         System.out.println("Time::Date");
//     }
// }

// class Date {
//     public static void main(String[] args) {
//         System.out.println("Date::main");
//     }
// }

class Program {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("args[0]=" + args[0]);
        System.out.println("args[1]=" + args[1]);
        int n1 = Integer.parseInt(args[0]); // unboxing
        int n2 = Integer.parseInt(args[1]);
        // System.out.println("Addition = " + (args[0] + args[1]));
        System.out.println("Addition = " + (n1 + n2));
    }
}