#!/usr/bin/env perl
BEGIN {
    # safe now
    push @INC, '.';
}
use DockerProjectBuilder;

$arg_count = $#ARGV + 1;
$src_dir = "";
%hash = ("source_dir" => "",
         "target_dir" => ".",
         "project_name" => "");

if ( $> != 0 ) {
  print "This script must be run as root\n";
  exit (0);
}

if ( $arg_count < 1 ) {
  print "This script must have at least 1 argument\n";
  exit (0);
}

my $arr_ref = &DockerProjectBuilder::create(\@ARGV);
my @arr = @{ $arr_ref };
$hash{"source_dir"} = $arr[0];
$hash{"project_name"}  = $arr[1];
system(qq(mkdir $hash{"target_dir"}/$hash{"project_name"}));
system(qq(chmod -R +x $hash{"target_dir"}/$hash{"project_name"}));
system(qq(chown -R dgb:dgb $hash{"target_dir"}/$hash{"project_name"}));
# (print "$_ = $hash{$_}\n")for(sort(keys(%hash)));
