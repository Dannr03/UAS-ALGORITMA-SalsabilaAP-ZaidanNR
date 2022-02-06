import java.util.Scanner;

public class UAS {
    public static void main(String []args){
        String nmPbl, noKTP, noNPWP, nmPrshn, jawab;
        int depo, harLmbr,totLmbr, totLot;
        boolean running = true;

        Scanner ingfut = new Scanner(System.in);
        harLmbr = 0;
        nmPrshn = "";

        
            System.out.println("===============================================================================");
            System.out.println("|<<<-------------------  TRANSAKSI SAHAM YEAGER GROUP  -------------------->>>|");
            System.out.println("|=============================================================================|");
            System.out.println("| No. |   Kode Saham    | Nama Perusahaan |  Total Lembar  | Harga Per-Lembar |");
            System.out.println("|-----------------------------------------------------------------------------|");
            System.out.println("|     |                 | PT Autopedia    |                |                  |");
            System.out.println("|  1  |      ASLC       | Sukses          | 12.746.354.780 |     Rp 250,-     |");
            System.out.println("|     |                 | Lestari Tbk.    |                |                  |");
            System.out.println("|-----------------------------------------------------------------------------|");
            System.out.println("|     |                 | PT Semacom      |                |                  |");
            System.out.println("|  2  |      SEMA       | Integrated      |  1.347.000.000 |     Rp 200,-     |");
            System.out.println("|     |                 | Tbk.            |                |                  |");
            System.out.println("|-----------------------------------------------------------------------------|");
            System.out.println("|     |                 | PT Adaro        |                |                  |");
            System.out.println("|  3  |      ADMR       | Minerals        | 40.882.331.500 |     Rp 150,-     |");
            System.out.println("|     |                 | Indonesia Tbk.  |                |                  |");
            System.out.println("|-----------------------------------------------------------------------------|");
            System.out.println("|     |                 | PT Ateliers     |                |                  |");
            System.out.println("|  4  |      AMIN       | Mecaniques      | 1.080.000.000  |     Rp 300,-     |");
            System.out.println("|     |                 | D Indonesie Tbk.|                |                  |");
            System.out.println("|-----------------------------------------------------------------------------|");
            System.out.println("|     |                 | PT Bank         |                |                  |");
            System.out.println("|  5  |      NOBU       | National Nobu   | 4.556.256.627  |     Rp 350,-     |");
            System.out.println("|     |                 | Tbk.            |                |                  |");
            System.out.println("|-----------------------------------------------------------------------------|");
            System.out.println("|     |                 | PT Borneo Olah  |                |                  |");
            System.out.println("|  6  |      BOSS       | Sarana Sukses   | 1.400.000.000  |     Rp 450,-     |");
            System.out.println("|     |                 | Tbk.            |                |                  |");
            System.out.println("|-----------------------------------------------------------------------------|");
            System.out.println("|     |                 | PT Wahana       |                |                  |");
            System.out.println("|  7  |      COCO       | Interfood       |  889.863.981   |     Rp 500,-     |");
            System.out.println("|     |                 | Nusantara Tbk.  |                |                  |");
            System.out.println("|-----------------------------------------------------------------------------|");
            System.out.println("|     |                 | PT Morenzo      |                |                  |");
            System.out.println("|  8  |      ENZO       | Abadi Perkasa   | 2.162.545.165  |     Rp 400,-     |");
            System.out.println("|     |                 | Tbk.            |                |                  |");
            System.out.println("|-----------------------------------------------------------------------------|");
            System.out.println("|     |                 | PT Alfa         |                |                  |");
            System.out.println("|  9  |      FIRE       | Energi          | 1.475.363.179  |     Rp 500,-     |");
            System.out.println("|     |                 | Investama Tbk.  |                |                  |");
            System.out.println("|-----------------------------------------------------------------------------|");
            System.out.println("|     |                 | PT Mitra        |                |                  |");
            System.out.println("|  10 |      KOPI       | Energi          |  697.266.668   |     Rp 550,-     |");
            System.out.println("|     |                 | Persada Tbk.    |                |                  |");
            System.out.println("===============================================================================");

            System.out.println("");
            System.out.println("");

            System.out.println("========================= [Input Data Pembeli Saham] ==========================");
            System.out.print("| Nama Pembeli  : ");
            nmPbl = ingfut.nextLine();
            System.out.print("| NO.KTP        : ");
            noKTP = ingfut.nextLine();
            System.out.print("| NO.NPWP       : ");
            noNPWP = ingfut.nextLine();
        while(running)
        {
            System.out.print("| Kode Saham    : ");
            String kodSah = ingfut.nextLine();
            System.out.println("===============================================================================");
            
            System.out.println("");
            System.out.println("");

            if("ASLC".equalsIgnoreCase(kodSah)){
                System.out.println("============================= [Data Perusahaan] ===============================");
                System.out.println("| Nama Perusahaan    : PT Autopedia Sukses Lestari Tbk.");
                System.out.println("| Kode Perusahaan    : ASLC");
                System.out.println("| Total Lembar       : 12.746.354.780");
                System.out.println("| Harga Per Lembar   : Rp 250,-");
                System.out.println("| .");
                System.out.println("| Nama Pembeli Saham : " + nmPbl);
                System.out.println("===============================================================================");
                harLmbr = 250;
                nmPrshn = "PT Autopedia Sukses Lestari Tbk.";
            }else if("SEMA".equalsIgnoreCase(kodSah)){
                System.out.println("============================= [Data Perusahaan] ===============================");
                System.out.println("| Nama Perusahaan    : PT Semacom Integrated Tbk.");
                System.out.println("| Kode Perusahaan    : SEMA");
                System.out.println("| Total Lembar       : 1.347.000.000");
                System.out.println("| Harga Per Lembar   : Rp 200,-");
                System.out.println("| .");
                System.out.println("| Nama Pembeli Saham : " + nmPbl);
                System.out.println("===============================================================================");
                harLmbr = 200;
                nmPrshn = "PT Semacom Integrated Tbk.";
            }else if("ADMR".equalsIgnoreCase(kodSah)){
                System.out.println("============================= [Data Perusahaan] ===============================");
                System.out.println("| Nama Perusahaan    : PT Adaro Minerals Indonesia Tbk.");
                System.out.println("| Kode Perusahaan    : ADMR");
                System.out.println("| Total Lembar       : 40.882.331.500");
                System.out.println("| Harga Per Lembar   : Rp 150,-");
                System.out.println("| .");
                System.out.println("| Nama Pembeli Saham : " + nmPbl);
                System.out.println("===============================================================================");
                harLmbr = 150; 
                nmPrshn = "PT Adaro Minerals Indonesia Tbk.";
            }else if("AMIN".equalsIgnoreCase(kodSah)){
                System.out.println("============================= [Data Perusahaan] ===============================");
                System.out.println("| Nama Perusahaan    : PT Ateliers Mecaniques D Indonesie Tbk.");
                System.out.println("| Kode Perusahaan    : AMIN");
                System.out.println("| Total Lembar       : 1.080.000.000");
                System.out.println("| Harga Per Lembar   : Rp 300,-");
                System.out.println("| .");
                System.out.println("| Nama Pembeli Saham : " + nmPbl);
                System.out.println("===============================================================================");
                harLmbr = 300; 
                nmPrshn = "PT Ateliers Mecaniques D Indonesie Tbk.";
            }else if("NOBU".equalsIgnoreCase(kodSah)){
                System.out.println("============================= [Data Perusahaan] ===============================");
                System.out.println("| Nama Perusahaan    : PT Bank National Nobu Tbk.");
                System.out.println("| Kode Perusahaan    : NOBU");
                System.out.println("| Total Lembar       : 4.556.256.627");
                System.out.println("| Harga Per Lembar   : Rp 350,-");
                System.out.println("| .");
                System.out.println("| Nama Pembeli Saham : " + nmPbl);
                System.out.println("===============================================================================");
                harLmbr = 350; 
                nmPrshn = "PT Bank National Nobu Tbk.";
            }else if("BOSS".equalsIgnoreCase(kodSah)){
                System.out.println("============================= [Data Perusahaan] ===============================");
                System.out.println("| Nama Perusahaan    : PT Borneo Olah Sarana Sukses Tbk.");
                System.out.println("| Kode Perusahaan    : BOSS");
                System.out.println("| Total Lembar       : 1.400.000.000");
                System.out.println("| Harga Per Lembar   : Rp 450,-");
                System.out.println("| .");
                System.out.println("| Nama Pembeli Saham : " + nmPbl);
                System.out.println("===============================================================================");
                harLmbr = 450; 
                nmPrshn = "PT Borneo Olah Sarana Sukses Tbk.";
            }else if("COCO".equalsIgnoreCase(kodSah)){
                System.out.println("============================= [Data Perusahaan] ===============================");
                System.out.println("| Nama Perusahaan    : PT Wahana Interfood Nusantara Tbk");
                System.out.println("| Kode Perusahaan    : COCO");
                System.out.println("| Total Lembar       : 889.863.981");
                System.out.println("| Harga Per Lembar   : Rp 500,-");
                System.out.println("| .");
                System.out.println("| Nama Pembeli Saham : " + nmPbl);
                System.out.println("===============================================================================");
                harLmbr = 500; 
                nmPrshn = "PT Wahana Interfood Nusantara Tbk.";
            }else if("ENZO".equalsIgnoreCase(kodSah)){
                System.out.println("============================= [Data Perusahaan] ===============================");
                System.out.println("| Nama Perusahaan    : PT Morenzo Abadi Perkasa Tbk.");
                System.out.println("| Kode Perusahaan    : ENZO");
                System.out.println("| Total Lembar       : 2.162.545.165");
                System.out.println("| Harga Per Lembar   : Rp 400,- ");
                System.out.println("| .");
                System.out.println("| Nama Pembeli Saham : " + nmPbl);
                System.out.println("===============================================================================");
                harLmbr = 400; 
                nmPrshn = "PT Morenzo Abadi Perkasa Tbk.";
            }else if("FIRE".equalsIgnoreCase(kodSah)){
                System.out.println("============================= [Data Perusahaan] ===============================");
                System.out.println("| Nama Perusahaan    : PT Alfa Energi Investama Tbk.");
                System.out.println("| Kode Perusahaan    : FIRE");
                System.out.println("| Total Lembar       : 1.475.363.179|");
                System.out.println("| Harga Per Lembar   : Rp 500,-");
                System.out.println("| .");
                System.out.println("| Nama Pembeli Saham : " + nmPbl);
                System.out.println("===============================================================================");
                harLmbr = 500; 
                nmPrshn = "PT Alfa Energi Investama Tbk.";
            }else if("KOPI".equalsIgnoreCase(kodSah)){
                System.out.println("============================= [Data Perusahaan] ===============================");
                System.out.println("| Nama Perusahaan    : PT Mitra Energi Persada Tbk.");
                System.out.println("| Kode Perusahaan    : KOPI");
                System.out.println("| Total Lembar       : 697.266.668");
                System.out.println("| Harga Per Lembar   : Rp 550,-");
                System.out.println("| .");
                System.out.println("| Nama Pembeli Saham : " + nmPbl);
                System.out.println("===============================================================================");
                harLmbr = 550; 
                nmPrshn = "PT Mitra Energi Persada Tbk.";
            }else{
                System.out.println("============================= [Data Perusahaan] ===============================");
                System.out.println("| Kode atau Perusahaan tidak terdaftar!");
                System.out.println("===============================================================================");
                harLmbr = 0;
                nmPrshn = "";
            }

                System.out.println("");
                System.out.println("");

                System.out.println("================================= [MESSAGE!] ==================================");
                System.out.println("| Apakah anda sudah yakin ingin membeli saham tersebut?");
                System.out.println("| Ketik [Y] jika yakin | Ketik [T] jika untuk ketik ulang kode saham");
                  System.out.print("| Jawaban Anda : ");              
                jawab = ingfut.nextLine();      
                if (jawab .equalsIgnoreCase("y")) {
                    running = false;
                }
                System.out.println("===============================================================================");
        }
       
        System.out.println("");
        System.out.println("");

        System.out.println("=========================== [Input Jumlah Deposit] ============================");
        System.out.println("| Note : Minimal Pembelian adalah 100 Lembar / 1 Lot.");
        do{  
          System.out.print("| Masukkan Jumlah Deposit : Rp. ");
        depo = ingfut.nextInt();
        totLmbr = depo/harLmbr;
        totLot = totLmbr/100;
        if(totLmbr < 100){
        System.out.println("| Deposit Kurang untuk pembelian minimal 100 Lembar / 1 Lot");
                running = true;
            }else{
                running = false;
            }
        }while(running);
        System.out.println("===============================================================================");

        System.out.println("");
        System.out.println("");

        System.out.println("========================== [Bukti Kepemilikan Saham] ==========================");
        System.out.println("| Nama Pembeli Saham  : " + nmPbl);
        System.out.println("| Nomor KTP           : " + noKTP);
        System.out.println("| Nomor NPWP          : " + noNPWP); 
        System.out.println("| Nama Perusahaan     : " + nmPrshn);
        System.out.println("| Jumlah Lembar Saham : " + totLmbr + " Lembar");
        System.out.println("| Jumlah Lot Saham    : " + totLot + " Lot");
        System.out.println("===============================================================================");
    }
}