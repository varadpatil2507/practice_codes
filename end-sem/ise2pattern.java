class Pattern{
	static void pattern(int size){
		for(int i=1;i<=size;i++){
			for(int j=1;j<=2*size-1;j++){
				if((i==1 && j==size) || (i==size && j==size)){
					System.out.print("*");
				}
				else if(i==size/2+1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		pattern(5);
	}
}