package hello.core.member;

/**
 * <b>클래스 제목(작업목적)</b>
 * <p>
 * 작업내용
 * </p>
 *
 * @author Choi, Inho <inho.choi@softwareinlife.com>
 * @since 2021/11/15
 */
public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
