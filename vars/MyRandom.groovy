import ca.lvin.books.jenkins.RandomWord 

def call() { 

	RandomWord rw = new RandomWord(this) 
	echo rw.get() 
} 
