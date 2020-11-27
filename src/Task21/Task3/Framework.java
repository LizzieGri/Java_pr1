package Task21.Task3;

import java.io.IOException;
import java.util.Scanner;

public class Framework {
    IDocument doc;
    ICreateDocument doc1;
    private void New() throws IOException {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Создать текстовый документ");
        i=scanner.nextInt();
        if(i==1) {
            Newtext();
            System.out.println("Текстовый документ создан");
        }
    }
    private void Open() throws IOException {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Открыть текстовый документ");
        i=scanner.nextInt();
        if(i==1) {
            Opentext();
            System.out.println("Текстовый документ открыт");
        }

    }
    private void Exit() throws IOException {
        Exittext();
        System.out.println("Завершение работы");
    }
    private void Save() throws IOException {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Сохранить текстовый документ");
        i=scanner.nextInt();
        if(i==1) {
            Savetext();
            System.out.println("Текстовый документ сохранен");
        }
    }
    private void Newtext() throws IOException {
        doc1 = new CreateTextDocument();
        doc = doc1.CreateNew();
        doc.create();
    }
    private void Opentext() throws IOException {
        doc1= new CreateTextDocument();
        doc=doc1.CreateOpen();
        doc.open();
    }
    private void Exittext() throws IOException {
        doc.close();
    }
    private void Savetext() throws IOException {
        doc.save();
    }
    public Framework() throws IOException {
        while (true) {
            int i=0;
            System.out.println("Выберите пункт меню");
            System.out.println("1.New");
            System.out.println("2.Open");
            System.out.println("3.Save");
            System.out.println("4.Exit");
            Scanner scanner = new Scanner(System.in);
            i=scanner.nextInt();
            if (i==4){
                Exit();
                break;
            }
            else if (i==1){
                New();
            }
            else if (i==2){
                Open();
            }
            else if (i==3){
                Save();
            }
        }
    }
}
