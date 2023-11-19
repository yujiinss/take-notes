package phonebookEx;

import java.util.List;

public class Handler {
	
	// Handler에서는 DAO의 함수를 호출하여 값을 받아온다 --> Main으로 값을 반환한다
	private PhonebookDAO dao = new PhonebookDAO();

	//1) 목록
	public List<PhonebookDTO> selectList() throws Exception {
		List<PhonebookDTO> list = dao.selectList();	// dao에게 요청하여 리스트를 받는다
		return list;								// 받아온 리스트를 메인에게 반환한다
	}

	//2) 추가
	public int insertPhonebook(PhonebookDTO ob)throws Exception {
		int row = dao.insert(ob);
		return row;
	}

	//3 ) 번호 수정
	public int updatePnum(int idx, String pnum)throws Exception {
		PhonebookDTO dto = new PhonebookDTO();
		dto.setIdx(idx);
		dto.setPnum(pnum);
		int row = dao.updatePnum(dto);
		return row;
	}
	//4) 즐겨 찾기	
	public int updateFavorite(int idx)throws Exception {
		int row = dao.updateFavorite(idx);
		return row;
	}
	
	//5) 삭제하기
	public int delete(int idx) throws Exception{
		int row = dao.delete(idx);
		return row;
	}

}





