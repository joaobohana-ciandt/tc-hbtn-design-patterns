public class VideoMediaPlayer implements AdvancedMediaPlayer{

    @Override
    public void reproduzirVlc(String nomeArquivo) {
        System.out.printf("Reproduzindo VLC: " + nomeArquivo);
    }

    @Override
    public void reproduzirMp4(String nomeArquivo) {
        System.out.println("Reproduzindo MP4: " + nomeArquivo);
    }
}
