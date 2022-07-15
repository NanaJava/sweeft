
	void countVariantsRec(int stairs) {
		if(stairs == 0) {
			totalCount++;
		}
		if(stairs < 0) {
			return;
		}
		countVariantsRec(stairs - 1);
		countVariantsRec(stairs - 2);
	}

	private int countVariants(int stearsCount) {
		countVariantsRec(stearsCount);
		return totalCount;
	}
	
	private int totalCount = 0;


