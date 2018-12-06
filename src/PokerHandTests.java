import static org.junit.Assert.*;
import org.junit.Test;

public class PokerHandTests {
	
	@Test
	public void givenWhiteHasHighCard_whenBlackHasLowerRankingHighCard_thenWhiteWinsByHighCard(){
		String[] white = {"2C", "3H", "10S", "JS", "AH"};
		String[] black = {"2H", "3D", "5S", "9C", "KD"};
		PokerHand sut = new PokerHand(white);
		PokerHand blackHand = new PokerHand(black);
		
		Boolean result = sut.beats(blackHand);
		assertEquals(true, result);
	}
	
	@Test
	public void givenWhiteHasPair_whenBlackHasHighCard_thenWhiteWins(){
		String[] white = {"2C", "3H", "4S", "4C", "AH"};
		String[] black = {"2H", "3D", "5S", "9C", "KD"};
		PokerHand sut = new PokerHand(white);
		PokerHand blackHand = new PokerHand(black);
		
		Boolean result = sut.beats(blackHand);
		assertEquals(true, result);
	}
	
	@Test
	public void givenWhiteHasPair_whenBlackHasLowerRankingPair_thenWhiteWins(){
		String[] white = {"2C", "3H", "10S", "10C", "QH"};
		String[] black = {"2H", "3D", "5S", "6C", "6D"};
		PokerHand sut = new PokerHand(white);
		PokerHand blackHand = new PokerHand(black);
		
		Boolean result = sut.beats(blackHand);
		assertEquals(true, result);
	}
	
	@Test
	public void givenWhiteHasPair_whenBlackHasSameRankingPair_thenWhiteWinsByHighCard(){
		String[] white = {"2C", "3H", "10S", "10C", "QH"};
		String[] black = {"2H", "3D", "5S", "6C", "6D"};
		PokerHand sut = new PokerHand(white);
		PokerHand blackHand = new PokerHand(black);
		
		Boolean result = sut.beats(blackHand);
		assertEquals(true, result);
	}
	
	@Test
	public void givenWhiteHasTwoPair_whenBlackHasPair_thenWhiteWins(){
		String[] white = {"8C", "9H", "9S", "QC", "QH"};
		String[] black = {"2H", "3D", "5S", "AC", "AD"};
		PokerHand sut = new PokerHand(white);
		PokerHand blackHand = new PokerHand(black);
		
		Boolean result = sut.beats(blackHand);
		assertEquals(true, result);
	}
	
	@Test
	public void givenWhiteHasTwoPair_whenBlackHasLowerRankingTwoPair_thenWhiteWins(){
		String[] white = {"8C", "9H", "9S", "KC", "KH"};
		String[] black = {"2H", "5D", "5S", "9C", "9D"};
		PokerHand sut = new PokerHand(white);
		PokerHand blackHand = new PokerHand(black);
		
		Boolean result = sut.beats(blackHand);
		assertEquals(true, result);
	}
	
	@Test
	public void givenWhiteHasTwoPair_whenBlackHasSameRankingTwoPair_thenWhiteWinsByHighCard(){
		String[] white = {"8C", "9H", "9S", "KC", "KH"};
		String[] black = {"3H", "5D", "5S", "9C", "9D"};
		PokerHand sut = new PokerHand(white);
		PokerHand blackHand = new PokerHand(black);
		
		Boolean result = sut.beats(blackHand);
		assertEquals(true, result);
	}
	
	
	@Test
	public void givenWhiteHasThreeOfAKind_whenBlackHasLowerRankingThreeOfAKind_thenWhiteWins(){
		String[] white = {"6C", "6H", "6S", "7C", "KH"};
		String[] black = {"5H", "5D", "5S", "9C", "JD"};
		PokerHand sut = new PokerHand(white);
		PokerHand blackHand = new PokerHand(black);
		
		Boolean result = sut.beats(blackHand);
		assertEquals(true, result);
	}
	
	@Test
	public void givenWhiteHasThreeOfAKind_whenBlackHasSameRankingThreeOfAKind_thenWhiteWinsByHighCard(){
		String[] white = {"9C", "JH", "JS", "JC", "QH"};
		String[] black = {"2H", "10D", "JS", "JC", "JD"};
		PokerHand sut = new PokerHand(white);
		PokerHand blackHand = new PokerHand(black);
		
		Boolean result = sut.beats(blackHand);
		assertEquals(true, result);
	}
	
	@Test
	public void givenWhiteHasStraight_whenBlackHasStraight_thenWhiteWinsByHighCard(){
		String[] white = {"9C", "10H", "JS", "QC", "KH"};
		String[] black = {"2H", "3D", "4S", "5C", "6D"};
		PokerHand sut = new PokerHand(white);
		PokerHand blackHand = new PokerHand(black);
		
		Boolean result = sut.beats(blackHand);
		assertEquals(true, result);
	}
	
	@Test
	public void givenWhiteHasFlush_whenBlackHasFlush_thenWhiteWinsByHighCard(){
		String[] white = {"4C", "6C", "7C", "9C", "AC"};
		String[] black = {"2H", "3H", "4H", "8H", "10H"};
		PokerHand sut = new PokerHand(white);
		PokerHand blackHand = new PokerHand(black);
		
		Boolean result = sut.beats(blackHand);
		assertEquals(true, result);
	}
	
	@Test
	public void givenWhiteHasFullHouse_whenBlackHasFullHouse_thenWhiteWins(){
		String[] white = {"5C", "5H", "5S", "QC", "QH"};
		String[] black = {"4H", "4D", "4S", "8C", "8D"};
		PokerHand sut = new PokerHand(white);
		PokerHand blackHand = new PokerHand(black);
		
		Boolean result = sut.beats(blackHand);
		assertEquals(true, result);
	}
	
	@Test
	public void givenWhiteHasFourOfAKind_whenBlackHasFourOfAKind_thenWhiteWins(){
		String[] white = {"10D", "10H", "10S", "10C", "KH"};
		String[] black = {"5H", "5D", "5S", "5C", "JD"};
		PokerHand sut = new PokerHand(white);
		PokerHand blackHand = new PokerHand(black);
		
		Boolean result = sut.beats(blackHand);
		assertEquals(true, result);
	}
	
	@Test
	public void givenWhiteHasStraightflush_whenBlackHasStraightflush_thenWhiteWinsByHighCard(){
		String[] white = {"5D", "6D", "7D", "8D", "9D"};
		String[] black = {"2S", "3S", "4S", "5S", "6S"};
		PokerHand sut = new PokerHand(white);
		PokerHand blackHand = new PokerHand(black);
		
		Boolean result = sut.beats(blackHand);
		assertEquals(true, result);
	}
}