class Pattern{
	public static void main(String[] args){
		int size=3;
		for(int i=1;i<=size+2;i++){
			for(int j=1;j<=size+2;j++){
				if(i==j && i+j==size+3){
					System.out.print("O");
				}
				else if(i==1 || j==1 || i==size+2 || j==size+2){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

class Pattern1{
	public static void main(String[] args){
		int size=2;
		int center=size/2 + 1;
		for(int i=1;i<=size+2;i++){
			for(int j=1;j<=size+2;j++){
				if(i==1 || j==1 || i==size+2 || j==size+2){
					System.out.print("*");
				}
				else if(i==(size/2 +1) || i==(size/2 +1)+1){
					if(j==center || j==center+1){
						System.out.print("E");
					}
					else{
						System.out.print(" ");
					}
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}	
}

class Pattern2 {
    public static void main(String[] args) {
        int size = 3;

        // Upper part
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= 2 * size; j++) {
                if (j <= i || j > (2 * size - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower part
        for (int i = size - 1; i >= 1; i--) {
            for (int j = 1; j <= 2 * size; j++) {
                if (j <= i || j > (2 * size - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

