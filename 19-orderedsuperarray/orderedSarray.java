public class orderedSarray extends sarray {
    public boolean add(String word) {
	if (size() == 0) {
	    super.add(word);
	} else if (word.compareTo(get(size() - 1)) > 0) {
	    add(size(),word);
	}
	return true;
    }

}
