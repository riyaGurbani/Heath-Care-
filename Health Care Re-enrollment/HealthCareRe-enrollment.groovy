boolean	flag	=	false;
ArrayList<String> lines	=	new ArrayList<String>()
ArrayList<String>	store	=	new ArrayList<String>()
count	=	0;
new File('C:/Users/riya.gurbani/Downloads/usecase1.CBL').eachLine {
	line -> "line : $line";
	lines.add(line)
	num	=	"49A01"

	checks	=	line[20..24]

	if(checks.contains(num))
	{

		count++;
	}
	if(count > 0) {

		store.add(line);

	}
	if(count > 1) {
		flag	=	true
	}
}
PrintStream ps = new PrintStream(new File("D:/Output_File.txt"));
if(flag	==	true) {
	str = ""
	println(lines.get(0)) + '\n'
	str += lines.get(0)
	for(i = 1; i<store.size(); i++) {
		println(store.get(i)) + '\n'
		str += store.get(i) + '\n'
	}
	System.setOut(ps);
	ps.print(str);
}
else {
	str2 =""
	for( i = 0 ; i<lines.size(); i++) {
		println(lines.get(i))
		str2 += lines.get(i) + '\n'
	}
	System.setOut(ps);
	ps.print(str2);
}

