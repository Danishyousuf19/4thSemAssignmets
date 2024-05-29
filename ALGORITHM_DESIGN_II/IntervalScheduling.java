
import java.util.PriorityQueue;

public class IntervalScheduling {
	PriorityQueue<job> list;

	IntervalScheduling() {
		list = new PriorityQueue<>();

	}

	static class job implements Comparable<job> {
		int start;
		int end;

		job(int s, int e) {
			start = s;
			end = e;
		}

		@Override
		public int compareTo(job o) {
			// TODO Auto-generated method stub
			return this.end - o.end;
		}

	}

	public void algorithm() {
		PriorityQueue<job> ans = new PriorityQueue<>();
		job prev = list.poll();
		ans.add(prev);
		while (!list.isEmpty()) {
			job cur = list.poll();
			if (cur.start >= prev.end) {
				ans.add(cur);
				prev = cur;
			}

		}
		System.out.println("Final Jobs");
		while (!ans.isEmpty()) {
			job cur = ans.poll();
			System.out.println(cur.start + " " + cur.end);
		}

	}

	public void display_initial_jobs() {
		System.out.println("Initial Jobs");
		PriorityQueue<job> Temp_list = new PriorityQueue<>();
		Temp_list.addAll(list);
		while (!Temp_list.isEmpty()) {
			job cur = Temp_list.poll();
			System.out.println(cur.start + " " + cur.end);
		}
	}

	public static void main(String[] args) {
		IntervalScheduling a = new IntervalScheduling();
		a.list.add(new job(0, 3));
		a.list.add(new job(2, 3));
		a.list.add(new job(3, 7));
		a.list.add(new job(4, 6));
		a.display_initial_jobs();
		
		a.algorithm();
	}
}