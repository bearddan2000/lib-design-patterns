package DockerProjectBuilder;

our %sub_language = ("-d -j -s" => "/swing",
            "-d -j -j" => "/jython",
            "-d -j -x" => "/javafx");

our %language = ("-d -j" => "/java",
                 "-d -d" => "/docker");

our %platform = ("-w" => "template/web",
                "-d" => "template/desktop",
                "-l" => "template/lib",
                "-b" => "template/bash");

sub usage {
  $msg = "Usage\n";
  $msg .= "-b bash based project\n";
  $msg .= "-l library based project\n";
  $msg .= "-w web based project\n";
  $msg .= "-d <LANGUAGE> desktop based project\n";
  $msg .= "LANGUAGE\n";
  $msg .= "-j <SUB_LANGUAGE> java based project\n";
  $msg .= "-d docker based project\n";
  $msg .= "SUB_LANGUAGE\n";
  $msg .= "-s swing based project\n";
  $msg .= "-j jython based project\n";
  $msg .= "-x javafx based project\n";
  return $msg;
}

sub hash_sub {
  my ($opt, $hash_ref) = @_;
  my %hash = %{ $hash_ref };
    if(defined $hash{$opt}){
      return $hash{$opt};
    } else {
      print "key: $opt not found.\n";
      print &usage;
      exit 1;
    }
}

sub opt {
  my ($opt, $hash_ref) = @_;
  chomp($opt);
  return &hash_sub($opt, $hash_ref);
}

sub create{
  my $arr_ref = shift;
  my @arr = @{ $arr_ref };
  my $line = "";
  my $prior = "";
  for ( my $i = 0; $i < $#arr; $i++ ){
      if($i == 0) { $prior = $arr[$i]; $line .= &opt($arr[$i], \%platform);}
      elsif($i == 1) { $prior .= " " . $arr[$i]; $line .= &opt($prior, \%language);}
      elsif($i == 2) { $prior .= " " . $arr[$i]; $line .= &opt($prior, \%sub_language);}
  }
  my $project = $line =~ s/\//-/gr;
  $project = $project =~ s/template-//gr;
  $project .= "-" . $arr[-1];
  my @arr = ($line, $project);
  # (print $_ . "\n")for(@arr);
  return \@arr;
}

1;
