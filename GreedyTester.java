import java.util.Arrays;

public class GreedyTester {
	public static void test1() {
		System.out.print("Test1:shedule hould contain in all assignments...");
		int[] weights = new int[] {13, 14, 23, 60, 2}; 
		int[] deadlines = new int[] {2, 3, 4, 5, 1};
		int m = weights.length;
		HW_Sched schedule =  new HW_Sched(weights, deadlines, m);
		int[] res = schedule.SelectAssignments();
		//System.out.println(Arrays.toString(res));
		int sum=0;
		for(int i=0;i<res.length;i++) {
			if(res[i]==-1) {
				continue;
			}
			sum+=weights[res[i]];
		}
		System.out.println(sum);
		if(sum==112) {
			System.out.println("passed!");
		}
		else {
			System.out.println("fail~");
		}
	}
	public static void test2() {
		System.out.print("Test2:not all assignments can be finished...");
		int[] weights = new int[] {1, 1, 1, 1, 1}; 
		int[] deadlines = new int[] {2, 1, 1, 5, 2};
		int m = weights.length;
		HW_Sched schedule =  new HW_Sched(weights, deadlines, m);
		int[] res = schedule.SelectAssignments();
		//System.out.println(Arrays.toString(res));
		int sum=0;
		for(int i=0;i<res.length;i++) {
			if(res[i]==-1) {
				continue;
			}
			sum+=weights[res[i]];
		}
		System.out.println(sum);
		if(sum==3) {
			System.out.println("passed!");
		}
		else {
			System.out.println("fail~");
		}
	}
	public static void test3() {
		System.out.print("Test3:schedule should maxmize the weights...");
		  int[] weights = new int[] {5,2,1,12,1}; 
		  int[] deadlines = new int[] {3,3,2,3,1};
		int m = weights.length;
		HW_Sched schedule =  new HW_Sched(weights, deadlines, m);
		int[] res = schedule.SelectAssignments();
		//System.out.println(Arrays.toString(res));
		int sum=0;
		for(int i=0;i<res.length;i++) {
			if(res[i]==-1) {
				continue;
			}
			sum+=weights[res[i]];
		}
		System.out.println(sum);
		if(sum==19) {
			System.out.println("passed!");
		}
		else {
			System.out.println("fail~");
		}
	}
	public static void test4() {
		System.out.print("Test4:...");
		  int[] weights = new int[] {5, 2, 1, 1}; 
		  int[] deadlines = new int[] {3, 1, 2, 1};
		int m = weights.length;
		HW_Sched schedule =  new HW_Sched(weights, deadlines, m);
		int[] res = schedule.SelectAssignments();
		//System.out.println(Arrays.toString(res));
		int sum=0;
		for(int i=0;i<res.length;i++) {
			if(res[i]==-1) {
				continue;
			}
			sum+=weights[res[i]];
		}
		System.out.println(sum);
		if(sum==8) {
			System.out.println("passed!");
		}
		else {
			System.out.println("fail~");
		}
	}
	public static void test5() {
		System.out.print("Test5:max weight assignment should be finished...");
		  int[] weights = new int[] {1, 2, 5, 1}; 
		  int[] deadlines = new int[] {1, 1, 1, 1};
		int m = weights.length;
		HW_Sched schedule =  new HW_Sched(weights, deadlines, m);
		int[] res = schedule.SelectAssignments();
		//System.out.println(Arrays.toString(res));
		int sum=0;
		for(int i=0;i<res.length;i++) {
			if(res[i]==-1) {
				continue;
			}
			sum+=weights[res[i]];
		}
		System.out.println(sum);
		if(sum==5) {
			System.out.println("passed!");
		}
		else {
			System.out.println("fail~");
		}
	}
	public static void test6() {
		System.out.print("Test6:schedule should maxmize the weights...");
		  int[] weights = new int[] {3, 2, 5, 4, 7}; 
		  int[] deadlines = new int[] {1, 2, 2, 3, 3};
		int m = weights.length;
		HW_Sched schedule =  new HW_Sched(weights, deadlines, m);
		int[] res = schedule.SelectAssignments();
		//System.out.println(Arrays.toString(res));
		int sum=0;
		for(int i=0;i<res.length;i++) {
			if(res[i]==-1) {
				continue;
			}
			sum+=weights[res[i]];
		}
		System.out.println(sum);
		if(sum==16) {
			System.out.println("passed!");
		}
		else {
			System.out.println("fail~");
		}
	}
	public static void test7() {
		System.out.print("Test7:some time slot in the schedule isempty ...");
		  int[] weights = new int[] {3, 2, 5, 4, 1}; 
		  int[] deadlines = new int[] {1, 1, 2, 3, 6};
		int m = weights.length;
		HW_Sched schedule =  new HW_Sched(weights, deadlines, m);
		int[] res = schedule.SelectAssignments();
		//System.out.println(Arrays.toString(res));
		int sum=0;
		for(int i=0;i<res.length;i++) {
			if(res[i]==-1) {
				continue;
			}
			sum+=weights[res[i]];
		}
		System.out.println(sum);
		if(sum==13) {
			System.out.println("passed!");
		}
		else {
			System.out.println("fail~");
		}
	}
	public static void test8() {
		System.out.print("Test8:...");
		  int[] weights = new int[] {3, 2, 5, 4, 4}; 
		  int[] deadlines = new int[] {5, 6, 5, 3, 6};
		int m = weights.length;
		HW_Sched schedule =  new HW_Sched(weights, deadlines, m);
		int[] res = schedule.SelectAssignments();
		//System.out.println(Arrays.toString(res));
		int sum=0;
		for(int i=0;i<res.length;i++) {
			if(res[i]==-1) {
				continue;
			}
			sum+=weights[res[i]];
		}
		System.out.println(sum);
		if(sum==18) {
			System.out.println("passed!");
		}
		else {
			System.out.println("fail~");
		}
	}
	public static void test9() {
		System.out.print("Test9:...");
		  int[] weights = new int[] {3, 10, 11, 22, 4}; 
		  int[] deadlines = new int[] {4, 6, 3, 2, 6};
		int m = weights.length;
		HW_Sched schedule =  new HW_Sched(weights, deadlines, m);
		int[] res = schedule.SelectAssignments();
		//System.out.println(Arrays.toString(res));
		int sum=0;
		for(int i=0;i<res.length;i++) {
			if(res[i]==-1) {
				continue;
			}
			sum+=weights[res[i]];
		}
		System.out.println(sum);
		if(sum==50) {
			System.out.println("passed!");
		}
		else {
			System.out.println("fail~");
		}
	}
	public static void test10() {
		System.out.print("Test10:...");
		  int[] weights = new int[] {3, 10, 1, 1, 1}; 
		  int[] deadlines = new int[] {1, 1, 1, 2, 6};
		int m = weights.length;
		HW_Sched schedule =  new HW_Sched(weights, deadlines, m);
		int[] res = schedule.SelectAssignments();
		//System.out.println(Arrays.toString(res));
		int sum=0;
		for(int i=0;i<res.length;i++) {
			if(res[i]==-1) {
				continue;
			}
			sum+=weights[res[i]];
		}
		System.out.println(sum);
		if(sum==12) {
			System.out.println("passed!");
		}
		else {
			System.out.println("fail~");
		}
	}
	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
		test5();
		test6();
		test7();
		test8();
		test9();
		test10();
	}	
}