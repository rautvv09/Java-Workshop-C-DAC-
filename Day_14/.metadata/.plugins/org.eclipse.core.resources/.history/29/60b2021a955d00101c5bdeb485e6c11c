package com.dkte.p3;

public class Program01 {
	int field3;
	static int field4;

	public void method1() {
		int localField = 10;
		class Local {
			int field1;
			// static int field2; // NOT OK

			// static void localMethod1() {} // NOT OK

			void localMethod2() {
				System.out.println(field1);
				System.out.println(field3);
				System.out.println(field4);
				System.out.println(localField);
			}
		}
	}

	private static void method2() {
		int localField = 10;
		class Local {
			int field1;
//			static int field2; // NOT OK

			// static void localMethod1() {} // NOT OK
			void localMethod2() {
				System.out.println(field1);
//				System.out.println(field3); // NOT OK
				System.out.println(field4);
				System.out.println(localField);
			}
		}
	}

	public static void main(String[] args) {

	}

}
