
boolean isProperly(String sequence) {
	int count = 0;
	for(int i = 0; i < sequence.length(); i++) {
		if(sequence.charAt(i) == '(') {
			count++;
		}
		if(sequence.charAt(i) == ')') {
			count--;
		}
		if(count < 0) {	
			return false;
		}
	}
	return true;
}


