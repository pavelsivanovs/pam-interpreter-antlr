from antlr4 import *
from antlr4.tree.Trees import Trees
from gen.PamLexer import PamLexer
from gen.PamParser import PamParser
from ExtendedPamVisitor import ExtendedPamVisitor
import constant
import nltk


def main(filename):
    input_stream = FileStream(filename)
    lexer = PamLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = PamParser(stream)
    tree = parser.progr()

    visitor = ExtendedPamVisitor()
    visitor.visit(tree)

    tree_string = Trees.toStringTree(tree, None, parser)
    tree = nltk.Tree.fromstring(tree_string)
    tree.draw()


if __name__ == '__main__':
    main(constant.INPUT)
