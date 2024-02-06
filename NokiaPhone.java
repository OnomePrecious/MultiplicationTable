import java.util.Scanner;
public class NokiaPhone {   
public static void main(String[] args) { 
Scanner input = new Scanner(System.in);

System.out.print("NOKIA MENU \n" + "1-> Phone book \n"+ "2-> Messages \n"+ "3-> Chat \n" +"4-> Call register \n" + "5-> Tones \n" +"6-> Settings \n" + "7-> Call divert \n" + "8-> Games \n"+ "9-> Calculator \n" + "10-> Reminders \n" + "11-> Clock \n" + "12-> Profiles \n" + "13-> Sim sevices \n" + "Enter option: ");

int phoneMenu = input.nextInt();
switch(phoneMenu){

case 1:  System.out.print("Welcome to PHONE BOOK \n"+ "1-> search \n"+ "2-> Service Nos \n" + "3-> Add name \n"+ "4-> Erase \n" + "5-> Edit \n" + "6-> Assign tone \n"+ "7-> Send b'card \n" + "8-> Options \n" + "  1-> type of view \n" + "  2-> memory status \n" + "9-> Speed dials \n" + "10-> Voice tags \n ");
}
int phoneBook = input.nextInt();
switch(phoneBook) {
case 1: System.out.println("welcome to search "); break;
case 2: System.out.println("welcome to service nos "); break;
case 3: System.out.println("welcome to add name "); break;
case 4: System.out.println("welcome to erase "); break;
case 5: System.out.println("welcome to edit "); break;
case 6: System.out.println("welcome to assign tone "); break;
case 7: System.out.println("welcome to send b'card "); break;

case 8: System.out.println("welcome to OPTIONS \n" + "1-> type of view \n" + "2-> memory status");
int option = input.nextInt();
switch(option){
case 1: System.out.println(" welcome to type of view "); break;
case 2: System.out.println("welcome to memory status "); break;
default: System.out.println("input a valid number "); break;  
}break;

case 9: System.out.println("welcome to speed dials "); break;
case 10: System.out.println("welcome to voice tags "); break;
default: System.out.println("input a valid number "); break;
}break;

System.out.print("MESSAGES \n" + "1-> Write messages \n" + "2-> Inbox \n" + "3 -> Outbox \n" + "4 -> Picture messages \n" + "5 -> Templates \n" + "6 -> Smileys \n" + "7 -> Message settings \n"    + " 1->Message centre number \n"    + "2-> Message sent as \n "    + "2-> Message validity \n"    + "2-> common   \n"    + "1-> Delivery reports \n"    + "2-> Reply via same centre \n"    + "3-> Character support \n"   + "8-> Info service \n"   + "9-> Voice mailbox number \n"   +"10-> Service command editor \n" + "Enter option: ");
int messages = input.nextInt();
switch(messages) {
case 1: System.out.println("welcome to write messages "); break;
case 2: System.out.println("welcome to Inbox "); break;
case 3: System.out.println("welcome to Outbox "); break;
case 4: System.out.println("welcome to Picture messages "); break;
case 5: System.out.println("welcome to Templates "); break;
case 6: System.out.println("welcome to Smileys "); break;

case 7: System.out.println("welcome to message SETTINGS \n" + "1-> Message centre number \n" + "2 -> Message sent as \n" + "3 -> Message validity \n ");
int settings = input.nextInt();
switch(settings){
case 1: System.out.println("welcome to Message centre number "); break;
case 2: System.out.println("welcome to Message sent as ");
case 3: System.out.println("welcome to Message validity "); break;
default: System.out.println("input a valid number "); break;

case 8: System.out.println("Welcome to COMMON \n" + "1-> Delivery reports \n" + "2-> Reply via same centre \n" + "3-> Character support \n ");
int common = input.nextInt();
switch(common) {
case 1: System.out.println("welcome to Delivery reports "); break;
case 2: System.out.println("welcome to Reply via same centre "); break;
case 3: System.out.println("welcome to Character support "); break;
default: System.out.println("input a valid number "); break;
}break;

case 9: System.out.println("welcome to INFO SERVICE \n" );
int info = input.nextInt();
switch(info) {
case 1: System.out.println("welcome to Info service "); break;
default: System.out.println("input a valid number "); break;
}break;

case 10: System.out.println("welcome to Voice mailbox number \n" );
int voice = input.nextInt();
switch(voice) {
case 1: System.out.println("welcome to voice mailbox number "); break;
default: System.out.println("input a valid number "); break;
}break;

case 11: System.out.println("welcome to SERVICE COMMAND EDITOR \n");
int editor = input.nextInt();
switch(editor) {
case 1: System.out.println("welcome to Service command editor "); break;
default: System.out.println("input a valid number "); break;
}break;

case 3: System.out.print("CHAT \n" + "Enter option: ");
int chat = input.nextInt();
switch(chat) {
case 1: System.out.println("welcome to chat "); break;
default: System.out.println("input a valid number "); break;
}break;

case 4: System.out.print("CALL REGISTER \n 1-> Missed calls \n 2-> Received calls \n 3-> Dialled numbers \n 4-> Erase recent calls \n 5-> Show call duration \n    1-> Last call duration \n   2-> All calls duration \n   3-> Received calls duration \n   4-> Dialled calls duration \n   5-> Clear timers \n   6-> Show call costs \n   1-> Last call cost \n   2-> All calls cost \n   3-> Clear counters \n      7-> Call cost settings \n   8-> Prepaid credit \n  Enter option: ");
int register = input.nextInt();
switch(call) {
case 1: System.out.println("welcome to Missed calls ");
case 2: System.out.println("welcome to Received calls ");
case 3: System.out.println("welcome to Dialled numbers ");
case 4: System.out.println("welcome to Erase recent call lists ");

case 5: System.out.println("welcome to SHOW CALL DURATION \n" + "1-> Last call duration \n" + "2-> All calls duration \n" + "3-> Received calls duration \n" + "4-. Dialled calls duration \n" + " 5-> Clear timers ");
case 1: System.out.println("welcome to Last call duration "); break;
case 2: System.out.println("welcome to All calls duration "); break;
case 3: System.out.println("welcome to Received calls duration "); break;
case 4: System.out.println("welcome to Dialled calls duration "); break;
case 5: System.out.println("welcome to Clear timers "); break;

case 6: System.out.println("welcome to SHOW CALL COST \n" + "1-> Last call cost \n" + "2-> All calls cost \n" + "3-> Clear counters ");
int cost = input.nextInt();
switch(cost) {
case 1: System.out.println("welcome to Last call cost ");
case 2: Sytem.out.println("welcome to All calls cost "); 
case 3: System.out.println("welcome to Clear counters ");break;
default: System.out.println("input a valid number ");
}break;

case 7: System.out.println("welcome to CALL COST SETTINGS \n" + "1-> Call cost limit \n" + "2-> Show costs in ");
int set = input.nextInt();
switch(set) {
case 1: System.out.println("welcome to call cost limit ");
case 2: System.out.println("welcome to show costs in ");
default: System.out.println("input a valid number "); break;
}break;

case 8: System.out.println("welcome to PREPAID CREDIT \n ");
int prepaid = input.nextInt();
switch(prepaid) {
case 1: System.out.println("welcome to prepaid credit "); break;
default: System.out.println("input a valid number "); break;
}break;

case 5: System.out.print("TONES \n" + "1-> Ringing tone \n" + "2-> Ringing volume \n" + "3-> Incoming call alert \n" + "4-> Composer \n" +"5-> Message alert tone \n" + "6-> Keypad tones \n" + "7-> Warning and game tones \n" + "8-> Vibrating alert \n" + "9. Screen saver \n " + "Enter option: ");
int tones = input.nextInt();
switch(tones) {
case 1: System.out.println("welcome to Ringing tones ");
case 2: System.out.println("Welcome to Ringing volume ");
case 3: System.out.println("welcome to Incoming call alert ");
case 4: System.out.println("welcome to Composer "); 
case 5: System.out.println("welcome to Message alert tone ");
case 6: System.out.println("welcome to Keypad tones ");
case 7: System.out.println("welcome to Warning and game tones ");
case 8: System.out.println("welcome to Vibrating alert ");
case 9: System.out.println("welcome to screen saver ");break;
default: System.out.println("input a valid number ");
}break;

case 6: System.out.print("SETTINGS \n 1-> Call settings \n   1-> Automatic redial \n   2-> Speed dialing \n   3->Call waiting options \n   4->Own number sending \n     5-> Phone line in use \n   6-> Automatic answer \n   2-> Phone settings \n   1-> Language \n   2-> Cell info display \n   3-> Welcome note \n   4-> Network selection \n   5 ->Lights \n +   6-> Confirm SIM service actions \n   3-> Security settings \n   1-> PIN code request \n   2-> Call barring service \n   3->Fixed dialling \n   4-> Closed user group \n   5->Phone security \n   6-> Change access codes \n   4-> Restore factory settings \n   Enter option: ");
int settings = input.nextInt();
switch(sttings) {
case 1: System.out.println("welcome to CALL SETTINGS \n 1-> Automatic redial \n 2-> Speed dialing \n 3-> Call waiting options \n 4-> Own number sending \n 5-> Phone line in use \n 6-> Automatic answer"); 
}
int call = input.nextInt();
switch(call){

case 1: System.out.println("welcome to Automatic redial"); break;
case 2: System.out.println("welcome to speed dialing "); break;
case 3: System.out.println("call waiting options"); break;
case 4: System.out.println("own number sending"); break;
case 5: System.out.println("phone line in use"); break;
case 6: System.out.println("Automatic answer"); break;
}break;

case 2: System.out.println("welcome to PHONE SETTINGS \n" + "1-> language \n" + "2-> cell info display \n" + "3-> note \n" + "4-> network selection \n" + "5-> lights \n" + "6-> confirm sim service actions");
int phone = input.nextInt();
switch(phone) { 

case 1: System.out.println("welcome to language"); break;
case 2: System.out.println("welcome to cell info display"); break;
case 3: System.out.println("welcome note"); break;
case 4: System.out.println("network selection"); break;
case 5: System.out.println("welcome to lights"); break;
case 6: System.out.println("welcome to confirm sim service actions"); break;
}break;

case 3: System.out.println("welcome to SECURITY SETTINGS \n 1-> pin code request \n 2-> call barring service \n 3-> fixed dialling \n 4-> closed user group \n 5-> phone security \n 6-> change access codes");
int secure = input.nextInt();
switch(secure){

case 1: System.out.println("welcome to pin code request"); break;
case 2: System.out.println("welcome to call barring service"); break;
case 3: System.out.println("welcome to fixed dialling"); break;
case 4: System.out.println("welcome to closed user group"); break;
case 5: System.out.println("welcome to phone security"); break;
case 6: System.out.println("welcome to change access codes"); break;
}break;

case 4: System.out.println("welcome to restore factory settings"); break;
default: System.out.println("input a valid number"); break;
}break;

case 7: System.out.print("CALL DIVERT \n Enter option: ");
int divert = input.nextInt();
switch(divert) {
case 1: System.out.println("welcome to call divert "); break;
default: System.out.println("input a valid number "); break;
}break;


case 8: System.out.print("GAMES \n Enter option: "); 
int games = input.nextInt();
switch(games) {
case 1: System.out.println("welcome to games "); break;
default: System.out.println("input a valid number "); break;
}break; 

case 9: System.out.print("CALCULATOR \n Enter option: ");
int calculate = input.nextInt();
switch(calculate) {
case 1: System.out.println("welcome to calculator ");break;
default: System.out.println("input a valid number "); break;
}break;

case 10: System.out.print("REMINDERS \n Enter option: ");
int remind = input.nextInt();
switch(remind) {
case 1: System.out.println("welcome to reminder ");break;
default: System.out.println("input a valid number "); break;
}break;

case 11: System.out.print("CLOCK \n 1-> Alarm clock \n 2-> Clock settings \n 3-> Date setting \n 4-> Stopwatch \n 5-> Countdown timer \n 6-> Auto update of date and time \n Enter options: ");
int time = input.nextInt();
switch(time) {
case 1: System.out.println("welcome to alarm clock ");break;
case 2: System.out.println("welcome to clock settings ");break;
case 3: System.out.println("welcome to date settings ");break;
case 4: System.out.println("welcome to stopwatch ");break;
case 5: System.out.println("welcome to countdown timer ");break;
case 6: System.out.println("welcome to auto update of date and time ");break;
default: System.out.println("input a valid number "); break;
}break;

case 12: System.out.println("PROFILES \n Enter option: ");
int profile = input.nextInt();
switch(profile) {
case 1: System.out.println("welcome to profiles ");break;
default: System.out.println("input a valid number "); break;
}break;


case 13: System.out.println("SIM SERVICES \n Enter option: ");
int sim = input.nextInt();
switch(sim) {
case 1: System.out.println("welcome to sim service ");break;
default: System.out.println("input a valid number "); break;
}break;
 
}

}