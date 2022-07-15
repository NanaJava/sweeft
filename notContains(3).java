
	int notContains(int[] array)  {
		Arrays.sort(array);
		for(int i = 1; i < array.length-1; i++) {
			if(array[i] > 0) {
				if(array[i] - array[i-1] >= 2) {
					return array[i-1] + 1;
				}
			}
		}
		return array[array.length - 1] + 1;
	}


