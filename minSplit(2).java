
	 void minSplitRec(int amount, int c) {
		if(amount < 0) {
			return;
		}
		if(amount == 0) {
			count = c;
			return;
		}
		if(count != 0) {
			return;
		}
		minSplitRec(amount - 50, c+1);
		minSplitRec(amount - 20, c+1);
		minSplitRec(amount - 10, c+1);
		minSplitRec(amount - 5, c+1);
		minSplitRec(amount - 1, c+1);
	}
	
	 int minSplit(int amount) {
		minSplitRec(amount,0);
		if(count == 0) {
			return -1;
		}
		return count;
	}
	
	private int count = 0;


