public class merge {

	public static void main(String[] args)
	
	{
		int a = 10;


		int[] array = new int[]{1,5,23,12,22,34,100,99,100000,2}; 


		int bottom= 0;


		int top = 9;


		System.out.println("pre Sorting Values:");


		for(int p=0; p< a; 	++p)


		{


			System.out.println(array[p]);


		}


		mergeSorting(array,bottom,top);


		System.out.println("Post Sorting Values:");


		for (int p=0; p<a; ++p)


		{


			System.out.println(array[p]);


		}


		


	}


		


		public static void merging(int[] array, int bottom, int middle, int top)


		{


			int a = array.length;


			int[] inst = new int[a];


			for(int p = bottom; p<=top; ++p)


			{


				inst[p] = array[p];


			}


			int p = bottom;


			int q = middle+1;


			int r= bottom;


			while( p <=middle && q<=top)


			{


				if (inst[p] <=inst[q])


				{


					array[r]=inst[p];


					++p;


				}


				else


				{


					array[r]= inst[q];


					++q;


				}


				++r;


			}


			while(p<=middle)


			{


				array[r]= inst[p];


				++r;


				++p;


				}


			}


		public static void mergeSorting(int[] array, int bottom, int top)


		{


			


			if(bottom < top)


			{


				int center = (bottom + top)/ 2;


				mergeSorting(array, bottom,center);


				mergeSorting(array,center+1,top);


				merging(array, bottom, center, top);


			}


		}

	}
