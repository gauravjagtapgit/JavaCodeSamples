package selenium_Hierarchy;

public class safari implements wb {

		public void safari() {
			System.out.println("click on google");
		}
		public void start() {
			System.out.println("launch");
			
		}

		@Override
		public void login(String username) {
			System.out.println("submit="+username);
			
		}

		@Override
		public void home(String search) {
			System.out.println("wwww"+search);
			
		}

		@Override
		public void close() {
			System.out.println("quite");
			
		}

}
