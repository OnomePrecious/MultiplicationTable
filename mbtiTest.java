import java.util.Scanner;
public class MbtiTest {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("What is your name ? ");
String name = input.nextLine();

System.out.println("Select only 'A' or 'B', otherwise, you would get an error message .");
char[] responses = new char [20];

if(responses != A || response != B) {  
System.out.println("Expected A or B as a response, I know this is an error, please retry again ");

String[] questionA = {"A."; "expend energy, enjoy groups","Interpret literally, "logical thinking, questioning, "organized, orderly, "more outgoing, think out loud," "practical, realistic, experential "imaginative, innovative, theoretical", "candid, straight forward, frank," "plan, schedule", "seek many tasks, public activities, interaction with others", "standard, usual, conventional," "firm, tend to criticize, hold the line," "regulated, structured," "external, communicative, express yourself," "focus on here and now, "tough minded, just," "preparation, plan ahead" "active, initiate," "facts, things, what is, "matter of fact," "issue-oriented," "control, govern"};

String[] questionB = {"B. "conserve energy, enjoy one-on-one," "look for meaning and possibilities" "empathetic, feeling, accommodating," "flexible, adaptable," "more reserved, think to yourself", "imaginative, innovative, theoretical," "tactful, kind, encouraging," "unplanned, spontaneous," "seek private, solitary activities with quiet to concentrate," "different, novel, unique," "gentle, tend to appreciate, conciliate," "easy-going, live and let live," "internal, reticent, keep to yourself," "look to the future, global perspective, big picture," "tender-hearted, merciful," "go with the flow, adapt as you go," "reflective, deliberate," "dreams, what could be, philosophical," "sensitive, people oriented, compassionate," "latitude, freedom"} ;

	for(int index = 0; index < index.length, index++) {
System.out.println(questions[index]);
char response = input.next().toUpperCase().charAt(0);






System.out.println("""

INFP
	Healer
	The Thoughtful Idealist (MBTI)
	The Mediator (16Personalities)

The INFP Personaity Type
INFPs are imaginative idealists, guided by their own core values and beliefs. To a Healer, possibilities are paramount; the realism of the moment is only of passing concern. They see potential for a better future, and pursue truth and meaning with their own individual flair.
INFPs are sensitive, caring, and compassionate, and are deeply concerned with the personal growth of themselves and others. Individualistic and nonjudgemental, INFPs believe that each persons must find their own path. They enjoy spending time exploring their own ideas and values, and are gently encouraging others to do the same. INFPs are creative and often artistic; they enjoy finding new outlets for self-expression.

what does INFP stand for?
INFP is one of the sixteen personality types created by Katharine Briggs and Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI). INFP stands for Introversion, Intuition, Feeling, and Perceiving, which are four core personality traits based on the work of psychologist C.G Jung. Each of the four letters of the INFP code signifies a key personality trait of this type. INFPs are energized  by time alone (Introverted), focus on ideas and concepts rather than facts and details (Intuitive), make decisions based on feelings and values (Feeling), and prefer to be spontaneous and flexible rather than planned and organized (Perceiving).
""")





}
}