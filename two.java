/// 我来解决一个bug
class two {
	/// main function
	public static void main(String[] args){
		System.out.println("Hello, Java!");
		System.out.println("args length:" + args.length);
		/// 扩展for循环
		for(String str : args){
			System.out.println("main args str:" + str);
		}
	}
}
