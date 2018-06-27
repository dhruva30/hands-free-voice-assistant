/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbot;

import com.sun.speech.freetts.*;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import java.io.IOException;

/**
 *
 * @author USER
 */
public class ChatBot {

   
    public static int countComma(String s){
        int count=0;
        int i;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)==',')
                count++;
        }
        return  count+1;
    }
    
     public static boolean checkUser(char arr[][], String symbol){
    int i,j;
    // row check
    int rowFLag=0;
   for(i=0;i<3;i++){
       if(arr[i][0]==symbol.charAt(0) && arr[i][1]==symbol.charAt(0) && arr[i][2]==symbol.charAt(0)){
           return true;
         }
         }
   // column check
   for(j=0;j<3;j++){
       if(arr[0][j]==symbol.charAt(0) && arr[1][j]==symbol.charAt(0) && arr[2][j]==symbol.charAt(0)){
           return true;
       }
   }
   
   // diagonal check
   if(arr[0][0]==symbol.charAt(0) && arr[1][1]==symbol.charAt(0) && arr[2][2]==symbol.charAt(0)){
       return true;
    }
   if(arr[2][0]==symbol.charAt(0) && arr[1][1]==symbol.charAt(0) && arr[0][2]==symbol.charAt(0)){
       return true;
   }
   return false;
    }
    public static boolean checkComp(char arr[][], String symbol){
    int i,j;
    // row check
    int rowFLag=0;
   for(i=0;i<3;i++){
       if(arr[i][0]==symbol.charAt(0) && arr[i][1]==symbol.charAt(0) && arr[i][2]==symbol.charAt(0)){
           return true;
         }
         }
   // column check
   for(j=0;j<3;j++){
       if(arr[0][j]==symbol.charAt(0) && arr[1][j]==symbol.charAt(0) && arr[2][j]==symbol.charAt(0)){
           return true;
       }
   }
   
   // diagonal check
   if(arr[0][0]==symbol.charAt(0) && arr[1][1]==symbol.charAt(0) && arr[2][2]==symbol.charAt(0)){
       return true;
    }
   if(arr[2][0]==symbol.charAt(0) && arr[1][1]==symbol.charAt(0) && arr[0][2]==symbol.charAt(0)){
       return true;
   }
   return false;
    }
    public static void tictactoe(){
        char arr[][]=new char[3][3];
        int a,b;
        for(a=0;a<3;a++){
            for(b=0;b<3;b++){
            
            arr[a][b]='*';
            }
                
            }
        System.out.println("*********+++++++++++++ Tic Tac Toe +++++++++++**************");
        System.out.println("Select a symbol press O for O X for X");
        Scanner sc=new Scanner(System.in);
        String x=sc.next();
        String comp;
        if(x.equals("O"))
            comp="X";
        else
            comp="O";
        boolean res=false;
        boolean com=false;
        while(!(res || com)){
            
            int i,j;
            for(i=0;i<3;i++){
                for(j=0;j<3;j++){
                    System.out.print(arr[i][j]);
                }
                System.out.println("");
            }
            System.out.println("Enter your position, enter the row and column number for example 1 3 => 1st row 3rd column:");
            Scanner ss=new Scanner(System.in);
            int r=ss.nextInt();
            int c=ss.nextInt();
            arr[r-1][c-1]=x.charAt(0);
            Random rand =new Random(3);
            int k,l;
            int flag=0;
            int rowcheck=0;
            int columncheck=0;
            int diagcheck=0;
            int cr=0,cc=0;
            // checking master move in row
            for(k=0;k<3;k++){
                if(arr[k][0]==x.charAt(0)&& arr[k][1]==x.charAt(0) && arr[k][2]=='*'){
                    rowcheck=1;
                    cr=k;
                    cc=2;
                    break;
                }
                if(arr[k][2]==x.charAt(0)&& arr[k][1]==x.charAt(0) && arr[k][0]=='*'){
                    rowcheck=1;
                    cr=k;
                    cc=0;
                    break;
                }
                if(arr[k][0]==x.charAt(0)&& arr[k][2]==x.charAt(0) && arr[k][1]=='*'){
                    rowcheck=1;
                    cr=k;
                    cc=1;
                    break;
                }
                
            }
            for(k=0;k<3;k++){
                if(arr[0][k]==x.charAt(0)&& arr[1][k]==x.charAt(0) && arr[2][k]=='*'){
                    columncheck=1;
                    cr=2;
                    cc=k;
                    break;
                }
                if(arr[2][k]==x.charAt(0)&& arr[1][k]==x.charAt(0) && arr[0][k]=='*'){
                    columncheck=1;
                    cr=0;
                    cc=k;
                    break;
                }
                if(arr[0][k]==x.charAt(0)&& arr[2][k]==x.charAt(0) && arr[1][k]=='*'){
                    columncheck=1;
                    cr=1;
                    cc=k;
                    break;
                }
                
            }
            // diagonal check
            if(arr[0][0]==x.charAt(0) && arr[1][1]==x.charAt(0) && arr[2][2]=='*'){
                diagcheck=1;
                cr=2;
                cc=2;
            }
            if(arr[1][1]==x.charAt(0) && arr[2][2]==x.charAt(0) && arr[0][0]=='*'){
                diagcheck=1;
                cr=0;
                cc=0;
            }
            if(arr[0][0]==x.charAt(0) && arr[2][2]==x.charAt(0) && arr[1][1]=='*'){
                diagcheck=1;
                cr=1;
                cc=1;
            }
            if(arr[2][0]==x.charAt(0) && arr[1][1]==x.charAt(0) && arr[0][2]=='*'){
                diagcheck=1;
                cr=0;
                cc=2;
            }
            if(arr[1][1]==x.charAt(0) && arr[0][2]==x.charAt(0) && arr[2][0]=='*'){
                diagcheck=1;
                cr=2;
                cc=0;
            }
            if(arr[0][2]==x.charAt(0) && arr[2][0]==x.charAt(0) && arr[1][1]=='*'){
                diagcheck=1;
                cr=1;
                cc=1;
            }
            
            if(rowcheck==1){
                arr[cr][cc]=comp.charAt(0);
            }
            else if(columncheck==1){
                 arr[cr][cc]=comp.charAt(0);
            }
            else if(diagcheck==1){
                 arr[cr][cc]=comp.charAt(0);
            }
            else{
            for(k=0;k<3;k++){
                for(l=0;l<3;l++){
                    if(arr[k][l]=='*'){
                        arr[k][l]=comp.charAt(0);
                        flag=1;
                        break;
                    }
                }
                if(flag==1)
                    break;
            }
            }
           
            res=checkUser(arr, x);
            com=checkComp(arr, comp);
            if(res==true)
                System.out.println("You win");
            if(com==true)
                System.out.println("Computer wins");
            
        }
            
        
    }
    
    
     public static String voicename="kevin8";
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        String q[]=new String[10000];
        String a[]=new String[10000];
        
        System.setProperty("mbrola.base", "E:\\mbrola");
        VoiceManager vm= VoiceManager.getInstance();
        
        Voice voice=vm.getVoice("mbrola_us1");
         voice.allocate();
         Configuration configuration = new Configuration();

        configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        configuration.setDictionaryPath("file:E:\\2385.dic");
        configuration.setLanguageModelPath("file:E:\\2385.lm");

	 LiveSpeechRecognizer recognizer = new LiveSpeechRecognizer(configuration);
       recognizer.startRecognition(true);
	SpeechResult result;
         int update=4;
        q[0]="Who are you";
        q[1]="What is the capital of india";
        q[2]="Who is the Prime minister of India";
        q[3]="What can you do";
        a[0]="I am your personal assistant,Your personal assistant here to help,The future of AI";
        a[1]="Delhi";
        a[2]="Narendra Modi";
        a[3]="Answer your questions, I can even open applications installed in your computer, And hopefully help you navigate in the future";
        System.out.println("************ChatBot**************");
        while (true) {
            ProcessBuilder browser=new ProcessBuilder("");
            //Process browserProcess=browser.start();
            int flag=0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Speak your query(Enter * to exit):");
            while((result=recognizer.getResult())!=null){
             String p=result.getHypothesis();
                System.out.println("You said:"+p);
            if(p.equals("*"))
                break;
            else if(p.equalsIgnoreCase("play tictactoe")){
                tictactoe();
            }
            else if(p.equalsIgnoreCase("open browser")){
                try {
                    browser=new ProcessBuilder("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
                    //browserProcess=
                    browser.start();
                    voice.speak("Browser opened");
                } catch (IOException ex) {
                    Logger.getLogger(ChatBot.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(p.equalsIgnoreCase("open google")){
                try {
                    browser=new ProcessBuilder("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe","google.com");
                    //browserProcess=
                    browser.start();
                    voice.speak("Google opened");
                } catch (IOException ex) {
                    Logger.getLogger(ChatBot.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(p.equalsIgnoreCase("open youtube")){
                try {
                    browser=new ProcessBuilder("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe","youtube.com");
                    //browserProcess=
                    browser.start();
                    voice.speak("Youtube opened");
                } catch (IOException ex) {
                    Logger.getLogger(ChatBot.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(p.equalsIgnoreCase("open prime")){
                try {
                    browser=new ProcessBuilder("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe","primevideo.com");
                    //browserProcess=
                    browser.start();
                    voice.speak("Prime opened");
                } catch (IOException ex) {
                    Logger.getLogger(ChatBot.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(p.equalsIgnoreCase("open notepad")){
                try {
                    Runtime.getRuntime().exec("C:\\Windows\\notepad.exe");
                    voice.speak("Notepad opened");
                } catch (IOException ex) {
                    Logger.getLogger(ChatBot.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(p.equalsIgnoreCase("open explorer")){
                try {
                    Runtime.getRuntime().exec("C:\\Windows\\explorer.exe");
                    voice.speak("File explorer opened");
                } catch (IOException ex) {
                    Logger.getLogger(ChatBot.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
             else if(p.equalsIgnoreCase("open Word")){
                try {
                    Runtime.getRuntime().exec("C:/Program Files/Microsoft Office/root/Office16/WINWORD.EXE");
                    voice.speak("Word opened");
                } catch (IOException ex) {
                    Logger.getLogger(ChatBot.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
             else if(p.equalsIgnoreCase("open powerpoint")){
                try {
                    Runtime.getRuntime().exec("C:/Program Files/Microsoft Office/root/Office16/POWERPNT.EXE");
                    voice.speak("Power point opened");
                } catch (Exception ex) {
                    Logger.getLogger(ChatBot.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(p.equalsIgnoreCase("close browser")){
                try {
                    //browserProcess.destroy();
                    Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
                    voice.speak("Browser closed");

                } catch (Exception ex) {
                    Logger.getLogger(ChatBot.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(p.equalsIgnoreCase("close notepad")){
                try {
                    Runtime.getRuntime().exec("taskkill /F /IM notepad.exe");
                    voice.speak("Notepad closed");
                } catch (IOException ex) {
                    Logger.getLogger(ChatBot.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(p.equalsIgnoreCase("close explorer")){
                try {
                    Runtime.getRuntime().exec("taskkill /F /IM explorer.exe");
                    voice.speak("Explorer closed");
                } catch (IOException ex) {
                    Logger.getLogger(ChatBot.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            else if(p.equalsIgnoreCase("close word")){
                try {
                    Runtime.getRuntime().exec("taskkill /F /IM WINWORD.EXE");
                    voice.speak("Word closed");
                } catch (IOException ex) {
                    Logger.getLogger(ChatBot.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            else if(p.equalsIgnoreCase("close powerpoint")){
                try {
                    Runtime.getRuntime().exec("taskkill /F /IM POWERPNT.EXE");
                    voice.speak("Powerpoint closed");
                } catch (IOException ex) {
                    Logger.getLogger(ChatBot.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            else if(p.equalsIgnoreCase("shutdown")){
                try {
                    Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");
                    voice.speak("Shutting down now");
                } catch (IOException ex) {
                    Logger.getLogger(ChatBot.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            else if(p.equalsIgnoreCase("restart")){
                try {
                    Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -r -t 0");
                    voice.speak("restarting now");
                } catch (IOException ex) {
                    Logger.getLogger(ChatBot.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            else{
            int i = 0;
            flag=0;
            for (i = 0; i < 10000; i++) {
                if (p.equalsIgnoreCase(q[i])) {
                    flag=1;
                    break;
                }
            }
            if(flag==1){
            String s=a[i];
            int limit=countComma(s);
            String ans[]=s.split(",",limit);
            Random rand=new Random();
            int index=rand.nextInt(limit);
            System.out.println(ans[index]);
           
           try{
               voice.speak(ans[index]);
           }
           catch (Exception e){

           }
            }
            /*else{
                System.out.println("Sorry, I do not know the answer to it." + "\n"+ "If you know please enter the answer:");
                voice.speak("Sorry, I do not know the answer to it If you know please enter the answer");
                Scanner scc= new Scanner(System.in);
                String g=scc.nextLine();
                q[update]=p;
                a[update]=g;
                update++;
                
                        
            }*/
        }
        }
        }
    }
    
}
