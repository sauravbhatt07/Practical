package feb28;
interface shape {
	void shape();
}
class circle implements shape {
	@Override
	public void shape() {
		System.out.println("Draw a circle");
	}}
class triangle implements shape {
	@Override
	public void shape() {
	System.out.println("Draw a triangle");
	}}
	class InterfaceEg2{
		public static void main(String[] args) {
			shape object = new circle();
			object.shape();
			
		}
	}
	