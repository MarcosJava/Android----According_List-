package br.com.mrcsfelipe.templatevalverde.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.mrcsfelipe.templatevalverde.R;
import br.com.mrcsfelipe.templatevalverde.model.ItemListDTO;

/**
 * Created by leonardo.amaral on 08/12/2015.
 */
public class ListInformativosAdapter extends ArrayAdapter<ItemListDTO> {

    public ListInformativosAdapter(Context context, int resource, List<ItemListDTO> objects) {
        super(context, resource,objects);
        this.items = objects;
    }

    private List<ItemListDTO> items;

    /**
     * private view holder class
     */
    private class ViewHolder {
        TextView textViewNome;
        TextView textViewTitulo;
        TextView textViewData;
        ImageView imageViewImagem;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Create viewHolder e ger dvdItem in position
        ViewHolder viewHolder = null;

        //Voo vooItem = this.getItem(position);

        ItemListDTO item = this.getItem(position); //a primeira posicao

        // Infla o layout na lista que for receber
        LayoutInflater layoutInflater =
                (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        // Caso o Layout nao exista ele cria o inflate
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.itens_lista_adapter, null);
            viewHolder = new ViewHolder();
            viewHolder.textViewNome = (TextView) convertView.findViewById(R.id.textViewNome);
            viewHolder.textViewTitulo  = (TextView) convertView.findViewById(R.id.textViewTitulo);
            viewHolder.textViewData = (TextView) convertView.findViewById(R.id.textViewData);
            viewHolder.imageViewImagem = (ImageView) convertView.findViewById(R.id.imageViewImagem);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        // Coloca os valores na posicao da lista
        viewHolder.textViewNome.setText(item.getNome());
        viewHolder.textViewTitulo.setText(item.getTitulo());
        viewHolder.textViewData.setText(item.getData());
        viewHolder.imageViewImagem.setImageResource(item.getImage());


//        Bitmap bImage = BitmapFactory.decodeResource(convertView.getResources(), item.getImage());
  //      viewHolder.imageViewImagem.setImageBitmap(bImage);


        // Retorna a view
        return convertView;
    }


}
