Class A{
		int arr[20] = new int[];
		int size = 0;
		int target = 0;
		int query = 0;

		Scanner sc = new Scanner(System.in);
		sc  = query.nextInt(); 
		
		int out1 = 0;
		int out2 = 0;

		void result(){
		
			while(query !=0)
			{
				sc = size.nextInt();
				for( int i=0; i<size; i++){
					sc = arr.nextInt(i);
				}

				sc = target.nextInt();

				for(int i=0; i<size; i++)
				{
					for(int j=0; j<size; j++)
					{
						if(i==j)
							break;
						if(arr[i]+arr[j] == target)
						{
							out1 = i;
							out2 = j;
							final(out1, out2);
							return;
						}
						
					}
				}
				
				
				query--;
			}

		}

		public static void main(String args[])
		{
			result();
		}
	}
}
		


 
