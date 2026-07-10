package in.co.rays.basicPrograms;

public class TestNoteCounter {
	public static void main(String[] args) {
		int amount = 2590;
		int[] notes = { 200, 100, 50, 10 };
		int[] notesReq = new int[4];

		for (int i = 0; i < notes.length; i++) {
			notesReq[i] = amount / notes[i];
			amount = amount - (notes[i] * notesReq[i]);

		}

		for (int i = 0; i < 4; i++) {
			System.out.println(notes[i] + " : " + notesReq[i]);
		}
	}

}
