package br.com.mrcsfelipe.templatevalverde.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by leonardo.amaral on 08/12/2015.
 */
public class ItemListDTO implements Parcelable {

    private String nome;
    private String titulo;
    private String data;
    private int image;

    public ItemListDTO (Parcel in){
        readFromParcel(in);
    }

    public ItemListDTO(String nome, String titulo, String data, int image) {
        this.nome = nome;
        this.titulo = titulo;
        this.data = data;
        this.image = image;
    }

    public ItemListDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nome);
        dest.writeString(this.titulo);
        dest.writeString(this.data);
        dest.writeInt(this.image);
    }

    private void readFromParcel(Parcel in) {
        this.nome  = in.readString();
        this.titulo = in.readString();
        this.data = in.readString();
        this.image = in.readInt();
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator<ItemListDTO>() {
        public ItemListDTO createFromParcel(Parcel in) {
            return new ItemListDTO(in);
        }

        public ItemListDTO[] newArray(int size) {
            return new ItemListDTO[size];
        }
    };
}
