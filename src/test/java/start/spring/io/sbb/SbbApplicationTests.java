package start.spring.io.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private AnswerRepository answerRepository;

	@Test
	void testJpa() {
		// Question q1 = new Question();
		// q1.setSubject("sbb가 무엇?");
		// q1.setContent("ㅈㄱㄴ");
		// q1.setCreateDate(LocalDateTime.now());
		// this.questionRepository.save(q1);

		// Question q2 = new Question();
		// q2.setSubject("model이 무엇?");
		// q2.setContent("ㅈㄱㄴ2");
		// q2.setCreateDate(LocalDateTime.now());
		// this.questionRepository.save(q2);
		
		// List<Question> all = this.questionRepository.findAll();
		// assertEquals(2, all.size());

		// Question q = all.get(0);
		// assertEquals("sbb가 무엇?", q.getSubject());

		// Optional<Question> oq = this.questionRepository.findById(1);
		// if(oq.isPresent()) {
		// 	Question q = oq.get();
		// 	assertEquals("sbb가 무엇?", q.getSubject());
		// }

		Optional<Question> oq = this.questionRepository.findById(2);
		assertTrue(oq.isPresent());
		Question q = oq.get();

		Answer a = new Answer();
		a.setContent("네 킹동생성됩니다");
		a.setQuestion(q);
		a.setCreateDate(LocalDateTime.now());
		this.answerRepository.save(a);
	}

}
