/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class ADecVariavel extends PDecVariavel
{
    private PTipo _tipo_;
    private PListaNomes _listaNomes_;
    private PSemicolon _semicolon_;

    public ADecVariavel()
    {
        // Constructor
    }

    public ADecVariavel(
        @SuppressWarnings("hiding") PTipo _tipo_,
        @SuppressWarnings("hiding") PListaNomes _listaNomes_,
        @SuppressWarnings("hiding") PSemicolon _semicolon_)
    {
        // Constructor
        setTipo(_tipo_);

        setListaNomes(_listaNomes_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new ADecVariavel(
            cloneNode(this._tipo_),
            cloneNode(this._listaNomes_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecVariavel(this);
    }

    public PTipo getTipo()
    {
        return this._tipo_;
    }

    public void setTipo(PTipo node)
    {
        if(this._tipo_ != null)
        {
            this._tipo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipo_ = node;
    }

    public PListaNomes getListaNomes()
    {
        return this._listaNomes_;
    }

    public void setListaNomes(PListaNomes node)
    {
        if(this._listaNomes_ != null)
        {
            this._listaNomes_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listaNomes_ = node;
    }

    public PSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(PSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipo_)
            + toString(this._listaNomes_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipo_ == child)
        {
            this._tipo_ = null;
            return;
        }

        if(this._listaNomes_ == child)
        {
            this._listaNomes_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipo_ == oldChild)
        {
            setTipo((PTipo) newChild);
            return;
        }

        if(this._listaNomes_ == oldChild)
        {
            setListaNomes((PListaNomes) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((PSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
