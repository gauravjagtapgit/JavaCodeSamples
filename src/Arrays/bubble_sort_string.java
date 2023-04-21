package Arrays;

public class bubble_sort_string {
	
	public static void main(String[]args) {
		
		String[]name= {"gaurav","rohit","zinu","munna","aniket"};
			String temp;
			for(int i=0;i<name.length;i++) {
				for(int j=0;j<name.length-1-i;j++) {
					if(name[j].compareTo(name[j+1])>0) {
						temp=name[j];
						name[j]=name[j+1];
						name[j+1]=temp;
					}
				}
			}
			for(int i=0;i<name.length;i++) {
				System.out.print(i+")"+name[i]+" ");
			}
		}
	}


