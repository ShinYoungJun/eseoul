
/*********************************************************************************************************
 				*최초작성일 : 2006.05.30
				*최초작성자 : 이준형
				*주요처리내용 : StringArray 관련 처리를 위한 Utility
				*수정일 :
				*수정자 :
				*수정내용 :
 *********************************************************************************************************/


package main.java.common.util;

public class StringArray {
	int sp = 0;
	private String[] array;
	private int growthSize;
	/**
	 * 문자열 배열을 생성한다.
	 * 기본 크기는 1024이며, 확장 크기는 256이다.
	 */
	public StringArray() {
		this(1024);
	}
	/**
	 * 확장 크기는 초기 크기의 1/4이다.
	 * @param initialSize 문자열 배열의 초기화된 크기
	 */
	public StringArray(int initialSize) {
		this(initialSize, (int)(initialSize/4));
	}
	/**
	 * 입력한 초기 크기의 문자열 배열을 생성한다.
	 * 확장 크기는 입력된 값으로 설정된다.
	 * @param initialSize 문자열 배열의 초기화된 크기
	 * @param growthSize 문자열 배열의 확장 시 확장 크기
	 */
	public StringArray(int initialSize, int growthSize) {
		this.growthSize = growthSize;
		array = new String[initialSize];
	}
	/**
	 * 문자열 배열에 문자열을 추가한다.
	 * @param i 추가할 문자열
	 */
	public void add(String i) {
		if(sp >= array.length) {
			String[] tmpArray = new String[array.length + growthSize];
			System.arraycopy(array, 0, tmpArray, 0, array.length);
			array = tmpArray;
		}
		array[sp] = i;
		sp += 1;
	}
	/**
	 * 값이 없는 부분을 잘라낸 문자열 배열을 반환한다.
	 * @return 값이 없는 부분을 잘라낸 문자열
	 */
	public String[] toArray() {
		String[] trimmedArray = new String[sp];
		System.arraycopy(array, 0, trimmedArray, 0, trimmedArray.length);
		return trimmedArray;
	}
}
